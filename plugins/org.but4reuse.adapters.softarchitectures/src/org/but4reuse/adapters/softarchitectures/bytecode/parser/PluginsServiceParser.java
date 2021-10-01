package org.but4reuse.adapters.softarchitectures.bytecode.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.but4reuse.adapters.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.softarchitectures.ServiceElement;
import org.but4reuse.adapters.softarchitectures.plugin_infos_extractor.utils.PluginInfosExtractor;
import org.but4reuse.adapters.softarchitectures.plugin_infos_extractor.utils.RegisterServiceParser;

public class PluginsServiceParser {
	
	static String pluginName;
	static String jarEntry;

	
	static int cpt = 0;
	public static List<ServiceElement> parsePluginClass(InputStream is, List<InterfaceElement> providedInterfaces,List<ServiceElement> pluginregisteredServices) throws IOException {
				
	//	List<ServiceElement> registeredServices = new ArrayList<>();

		ClassReader cr = new ClassReader(is);
		
		ClassNode cn = new ClassNode();		
		
		cr.accept(cn, 0);
		
		List<MethodNode> methods = cn.methods;
		
		
		for(MethodNode mn : methods) {			
			//System.out.println("- Méthode analysée : "+mn.name+" "+mn.desc);
			
			InsnList instructions = mn.instructions;
			
			for(int i = 0 ; i < instructions.size(); i++) {
				AbstractInsnNode instr = instructions.get(i);				
				//System.out.println("# : "+instr.getOpcode()+" "+instr.getClass());
				//if(instr instanceof MethodInsnNode) {System.out.println("## : "+((MethodInsnNode)instr).name);}
				//if(instr instanceof TypeInsnNode) {System.out.println("## : "+((TypeInsnNode)instr).desc);}
				if(instr.getOpcode() == Opcodes.INVOKEVIRTUAL || instr.getOpcode() == Opcodes.INVOKEINTERFACE) { // Ne prendre en compte que les invocations de méthodes
					MethodInsnNode minstr = (MethodInsnNode)instr;
					
					if(minstr.name.equals("registerService")) { // Remplacer "n" par "registerSerivce" ou inversement (pour tester le code tout en bas)
						
						System.out.println("=> Trouve une invocation a registerService ");
						System.out.println("=> dans la methode "+mn.name+" de la classe : <"+jarEntry+"> dans le plugin <"+pluginName+"> :");
						cpt++;
						AbstractInsnNode ains = instructions.get(i-2); // Pour connaître le 2ème argument de l'invocation à registerService, il faut remonter à l'instruction -4
						
						//System.out.println("\t Operation precedente, correspondant au 2eme argument passe (instruction "+(i-4)+") :"+ ains.getOpcode());
						//System.out.println("\t Type du service enregistre : ");
						String object = "";
						String itf = "";
						switch(ains.getOpcode()) {						
						case -1 :
						case 1 :
							ains = ains.getNext().getNext();
							if(ains.getOpcode() == 25) {
								VarInsnNode ins = (VarInsnNode)ains;
								List<LocalVariableNode> lvars = mn.localVariables;
								boolean found = false;
								for(LocalVariableNode lvar : lvars) {
									if(lvar.index == ins.var) {
										//System.out.println("\t Local Variable/Param Type : "+lvar.desc);
										object = convertService(lvar.desc);
										found = true;
										break;
									}
								}
								if(! found) System.out.println("\t Local Variable/Param Type not found"); 
								
							}
							else {
								if(ains.getOpcode() == 182 || ains.getOpcode() == 184 || ains.getOpcode() == 185) {
									MethodInsnNode insm = (MethodInsnNode)ains;
									System.out.println("\t Method/Constructor Returned Object Type : "+insm.desc);
									object = convertService(insm.desc);
									break;
								}								
							}
							break;
						case 18 : // LDC (Load Constant)
							LdcInsnNode lins = (LdcInsnNode)ains;							
							//System.out.println("\t Constant Type : "+lins.cst);
							object = convertService(lins.cst.toString());
							break;							
						case 25 : // Accès à une variable locale ou bien un paramètre : VarInsnNode
							VarInsnNode ins = (VarInsnNode)ains;
							List<LocalVariableNode> lvars = mn.localVariables;
							boolean found = false;
							for(LocalVariableNode lvar : lvars) {
								if(lvar.index == ins.var) {
									//System.out.println("\t Local Variable/Param Type : "+lvar.desc);
									object = convertService(lvar.desc);
									found = true;
									break;
								}
							}
							if(! found) System.out.println("\t Local Variable/Param Type not found"); 
							
							break;
						case 89: // Dupliquer la valeur au sommet de la pile
							ains = ains.getNext();
							if(ains.getOpcode() == 183) {
								MethodInsnNode insm = (MethodInsnNode)ains;
								if(insm.name.equals("<init>")) { // Appel de constructeur
									TypeInsnNode inst = (TypeInsnNode)(insm.getPrevious().getPrevious()); // En cas d'instanciation avec new, il faut remonter deux instructions plus haut pour retrouver l'expression de Type utilisée
									//System.out.println("\t Instantiation Type : "+inst.desc);
									object = convertService(inst.desc);
									break;
								}
							}			
							else {
								if(ains.getOpcode() == 25) {
									ins = (VarInsnNode)ains;
									lvars = mn.localVariables;
									found = false;
									for(LocalVariableNode lvar : lvars) {
										if(lvar.index == ins.var) {
											//System.out.println("\t Local Variable/Param Type : "+lvar.desc);
											object = convertService(lvar.desc);
											found = true;
											break;
										}
									}
									if(! found) System.out.println("\t Local Variable/Param Type not found"); 
									
									break;
								}
							}
							
						case 178: // Accès à un attribut statique : FieldInsnNode
						case 180: // Accès à un attribut d'instance : FieldInsnNode
							
							if(ains instanceof FieldInsnNode){
								FieldInsnNode insf = (FieldInsnNode)ains;
								//System.out.println("\t Field Type : "+insf.desc);
								object = convertService(insf.desc);
							}
							
							break;
						
						case 183: // Invocation de méthode spéciale : MethodInsnNode
							MethodInsnNode insm = (MethodInsnNode)ains;
							if(insm.name.equals("<init>")) { // Appel de constructeur
								if(insm.getPrevious().getPrevious() instanceof TypeInsnNode){
									TypeInsnNode inst = (TypeInsnNode)(insm.getPrevious().getPrevious()); // En cas d'instanciation avec new, il faut remonter deux instructions plus haut pour retrouver l'expression de Type utilisée
									//System.out.println("\t Instantiation Type : "+inst.desc);
									object = convertService(inst.desc);
								}
								break;
							}							
						case 182: // Invocation de méthode : MethodInsnNode
						case 184: // Invocation de méthode statique : MethodInsnNode
						case 185: // Invocation de méthode d'interface : MethodInsnNode
							insm = (MethodInsnNode)ains;
							//System.out.println("\t Method/Constructor Returned Object Type : "+insm.desc);
							object = convertService(insm.desc);
							break;
						case 192: // Cast de type
						case 187: // Instanciation de type
							TypeInsnNode inst = (TypeInsnNode)ains;
							//System.out.println("\t Instantiation Type : "+inst.desc);
							object = convertService(inst.desc);
							break;
						default: //System.out.println("# Type non trouvé pour "+ains.getOpcode()+" : "+ains.getClass()); 
								/*throw new RuntimeException("Façon de passer un argument non prise en compte : "+
									ains.getOpcode()+"\n Instruction de type "+ains.getClass());*/
						
						}
						
						if(i-8 < 0) continue;
						ains = instructions.get(i-8);

						switch(ains.getOpcode()) {
						case 182:
							MethodInsnNode insm = (MethodInsnNode)ains;
							if(insm.getPrevious() instanceof LdcInsnNode) {
								LdcInsnNode inst = (LdcInsnNode)(insm.getPrevious());
								itf = convertService(inst.cst.toString());
							}
							
							break;
						case 18:
							LdcInsnNode lins = (LdcInsnNode)ains;
							itf = convertService(lins.cst.toString());
							break;
							
						}
						
						if(itf != "" || object != ""){
							String [] tmp = itf.split(" ");
							 InterfaceElement itfElement =null;

							if(tmp.length==1){
								
								   if(!itf.equals("") &&  !itf.startsWith("java.lang.")){
									   
									   itfElement=RegisterServiceParser.findInterfaceElement(itf,providedInterfaces);
									   
								   }
								   if(!RegisterServiceParser.serviceAlreadyExists(pluginregisteredServices,itf, object)){   
									   
									   pluginregisteredServices.add(new ServiceElement(itfElement,itf, object));
										PluginInfosExtractor.nbservices2++;

								   }
								
							//	lse.add(new ServiceElement(itf, object));
							}
							else{
								  if(!RegisterServiceParser.serviceAlreadyExists(pluginregisteredServices,itf, object)){   
										
									  pluginregisteredServices.add(new ServiceElement(itfElement,itf, object));
										PluginInfosExtractor.nbservices2++;


								  }
							//	lse.add(new ServiceElement("", object));
							}
						}
					}
				}
			}
		}
		return pluginregisteredServices;
		
	}
	
	// TODO check this method for the case of name = (Ljava/lang/String;Ljava/lang/Object;Ljava/util/Dictionary;)Lorg/osgi/framework/ServiceRegistration;
	public static String convertService(String name){
		String service = name.replace("/", ".").replace("(", "").replace(")","").replace(";","").replace("[", "");
		service = service.charAt(0)=='L'?service.substring(1):service;
		//System.out.println("Service bytecode: "+service);
		return service;
	}


	public static List<ServiceElement> parsePluginClassForConsumedServ(FileInputStream fis, List<InterfaceElement> requiredInterfaces, List<ServiceElement> pluginConsumedServices) throws IOException {
	
	//	List<ServiceElement> consumedServices = new ArrayList<>();

		ClassReader cr = new ClassReader(fis);
		
		ClassNode cn = new ClassNode();		
		cr.accept(cn, 0);
		
		List<MethodNode> methods = cn.methods;
		
		
		for(MethodNode mn : methods) {			
			//System.out.println("- Méthode analysée : "+mn.name+" "+mn.desc);
			
			InsnList instructions = mn.instructions;
			
			for(int i = 0 ; i < instructions.size(); i++) {
				AbstractInsnNode instr = instructions.get(i);				
				//System.out.println("# : "+instr.getOpcode()+" "+instr.getClass());
				//if(instr instanceof MethodInsnNode) {System.out.println("## : "+((MethodInsnNode)instr).name);}
				//if(instr instanceof TypeInsnNode) {System.out.println("## : "+((TypeInsnNode)instr).desc);}
				if(instr.getOpcode() == Opcodes.INVOKEVIRTUAL || instr.getOpcode() == Opcodes.INVOKEINTERFACE) { // Ne prendre en compte que les invocations de méthodes
					MethodInsnNode minstr = (MethodInsnNode)instr;
					
					if(minstr.name.equals("getServiceReference")) { // Remplacer "n" par "registerSerivce" ou inversement (pour tester le code tout en bas)
						
						System.out.println("=> Trouve une invocation a getServiceReference ");
						System.out.println("=> dans la methode "+mn.name+" de la classe : <"+jarEntry+"> dans le plugin <"+pluginName+"> :");
						cpt++;
					//	if(i>=4){
						AbstractInsnNode ains = instructions.get(i-4); // Pour connaître le 2ème argument de l'invocation à registerService, il faut remonter à l'instruction -4
					//	}
						//System.out.println("\t Operation precedente, correspondant au 2eme argument passe (instruction "+(i-4)+") :"+ ains.getOpcode());
						//System.out.println("\t Type du service enregistre : ");
						String object = "";
						String itf = "";
						switch(ains.getOpcode()) {						
						case -1 :
						case 1 :
							ains = ains.getNext().getNext();
							if(ains.getOpcode() == 25) {
								VarInsnNode ins = (VarInsnNode)ains;
								List<LocalVariableNode> lvars = mn.localVariables;
								boolean found = false;
								for(LocalVariableNode lvar : lvars) {
									if(lvar.index == ins.var) {
										//System.out.println("\t Local Variable/Param Type : "+lvar.desc);
										object = convertService(lvar.desc);
										found = true;
										break;
									}
								}
								if(! found) System.out.println("\t Local Variable/Param Type not found"); 
								
							}
							else {
								if(ains.getOpcode() == 182 || ains.getOpcode() == 184 || ains.getOpcode() == 185) {
									MethodInsnNode insm = (MethodInsnNode)ains;
									System.out.println("\t Method/Constructor Returned Object Type : "+insm.desc);
									object = convertService(insm.desc);
									break;
								}								
							}
							break;
						case 18 : // LDC (Load Constant)
							LdcInsnNode lins = (LdcInsnNode)ains;							
							//System.out.println("\t Constant Type : "+lins.cst);
							object = convertService(lins.cst.toString());
							break;							
						case 25 : // Accès à une variable locale ou bien un paramètre : VarInsnNode
							VarInsnNode ins = (VarInsnNode)ains;
							List<LocalVariableNode> lvars = mn.localVariables;
							boolean found = false;
							for(LocalVariableNode lvar : lvars) {
								if(lvar.index == ins.var) {
									//System.out.println("\t Local Variable/Param Type : "+lvar.desc);
									object = convertService(lvar.desc);
									found = true;
									break;
								}
							}
							if(! found) System.out.println("\t Local Variable/Param Type not found"); 
							
							break;
						case 89: // Dupliquer la valeur au sommet de la pile
							ains = ains.getNext();
							if(ains.getOpcode() == 183) {
								MethodInsnNode insm = (MethodInsnNode)ains;
								if(insm.name.equals("<init>")) { // Appel de constructeur
									TypeInsnNode inst = (TypeInsnNode)(insm.getPrevious().getPrevious()); // En cas d'instanciation avec new, il faut remonter deux instructions plus haut pour retrouver l'expression de Type utilisée
									//System.out.println("\t Instantiation Type : "+inst.desc);
									object = convertService(inst.desc);
									break;
								}
							}			
							else {
								if(ains.getOpcode() == 25) {
									ins = (VarInsnNode)ains;
									lvars = mn.localVariables;
									found = false;
									for(LocalVariableNode lvar : lvars) {
										if(lvar.index == ins.var) {
											//System.out.println("\t Local Variable/Param Type : "+lvar.desc);
											object = convertService(lvar.desc);
											found = true;
											break;
										}
									}
									if(! found) System.out.println("\t Local Variable/Param Type not found"); 
									
									break;
								}
							}
							
						case 178: // Accès à un attribut statique : FieldInsnNode
						case 180: // Accès à un attribut d'instance : FieldInsnNode
							
							if(ains instanceof FieldInsnNode){
								FieldInsnNode insf = (FieldInsnNode)ains;
								//System.out.println("\t Field Type : "+insf.desc);
								object = convertService(insf.desc);
							}
							
							break;
						
						case 183: // Invocation de méthode spéciale : MethodInsnNode
							MethodInsnNode insm = (MethodInsnNode)ains;
							if(insm.name.equals("<init>")) { // Appel de constructeur
								if(insm.getPrevious().getPrevious() instanceof TypeInsnNode){
									TypeInsnNode inst = (TypeInsnNode)(insm.getPrevious().getPrevious()); // En cas d'instanciation avec new, il faut remonter deux instructions plus haut pour retrouver l'expression de Type utilisée
									//System.out.println("\t Instantiation Type : "+inst.desc);
									object = convertService(inst.desc);
								}
								break;
							}							
						case 182: // Invocation de méthode : MethodInsnNode
						case 184: // Invocation de méthode statique : MethodInsnNode
						case 185: // Invocation de méthode d'interface : MethodInsnNode
							insm = (MethodInsnNode)ains;
							//System.out.println("\t Method/Constructor Returned Object Type : "+insm.desc);
							object = convertService(insm.desc);
							break;
						case 192: // Cast de type
						case 187: // Instanciation de type
							TypeInsnNode inst = (TypeInsnNode)ains;
							//System.out.println("\t Instantiation Type : "+inst.desc);
							object = convertService(inst.desc);
							break;
						default: //System.out.println("# Type non trouvé pour "+ains.getOpcode()+" : "+ains.getClass()); 
								/*throw new RuntimeException("Façon de passer un argument non prise en compte : "+
									ains.getOpcode()+"\n Instruction de type "+ains.getClass());*/
						
						}
						
						if(i-8 < 0) continue;
						ains = instructions.get(i-8);

						switch(ains.getOpcode()) {
						case 182:
							MethodInsnNode insm = (MethodInsnNode)ains;
							if(insm.getPrevious() instanceof LdcInsnNode) {
								LdcInsnNode inst = (LdcInsnNode)(insm.getPrevious());
								itf = convertService(inst.cst.toString());
							}
							
							break;
						case 18:
							LdcInsnNode lins = (LdcInsnNode)ains;
							itf = convertService(lins.cst.toString());
							break;
							
						}
						
						if(itf != "" && object != ""){
							String [] tmp = itf.split(" ");
							   InterfaceElement itfElement =null;

							if(tmp.length==1){
								       if( !itf.startsWith("java.lang.")){
									   itfElement=RegisterServiceParser.findInterfaceElement(itf,requiredInterfaces);
								       }
										//TODO get the objname from declared variables
								       if(!RegisterServiceParser.serviceAlreadyExists(pluginConsumedServices,itf, object)){   
										   
								    	   pluginConsumedServices.add(new ServiceElement(itfElement, itf,object));
											PluginInfosExtractor.nbserviceclients2++;
								   
								       }
					//			System.err.println("===== >Creattinh ServiceElement -- INTERFACE");
					//			ServiceElement se = new ServiceElement(itf, object);
					//			lse.add(se);
								
								
							}
							else{
								System.err.println("===== >Creattinh ServiceElement -- OBJ");
								  if(!RegisterServiceParser.serviceAlreadyExists(pluginConsumedServices,itf, object)){   
										
									  pluginConsumedServices.add(new ServiceElement(itfElement,itf, object));
									  
										PluginInfosExtractor.nbserviceclients2++;

								  }
							}
						}
					}
				}
			}
		}
		return pluginConsumedServices;
	}
	
	public static void main(String[] args) throws IOException {
		String folder = "C:\\Users\\kerdoudi\\Desktop\\distributions_oxygen\\eclipse-jee-2018-09-win32-x86_64\\eclipse\\plugins";
		
		File f = new File(folder);
		
		File[] plugins = f.listFiles();
		

		
		for(File plugin : plugins) {
			if(! plugin.isDirectory()) {
				if(plugin.getName().endsWith(".jar")) {
					JarFile jarFile = new JarFile(plugin.getAbsolutePath());  
			         Enumeration<JarEntry> enumOfJar = jarFile.entries();   
			         while (enumOfJar.hasMoreElements()) {
			            JarEntry je = enumOfJar.nextElement();
			            if(je.getName().endsWith(".class")) {
			            	pluginName = plugin.getName();
			            	jarEntry = je.getName();
			            	InputStream is = jarFile.getInputStream(je);	
			            	ClassReader cr = new ClassReader(is);
			        		
			        //		List<MethodNode> methods = cn.methods;
                     //       System.out.println(methods.size());
                            String n = cr.getClassName();
							n=n.replaceAll("/", ".");
							String[] words = n.split("\\.");
							System.out.println(words.length);
							
							String packageName="";
							if(words.length > 1){
							 packageName = n.substring(0, n.length()- words[words.length-1].length()-1);
							}
			            	java.lang.System.out.println(n);

			            	java.lang.System.out.println(packageName);
			//            	parsePluginClass(is, new ArrayList<ServiceElement>());
			            }
			         }
				}
			}
		}
		System.out.println("Nombre total de registerService : "+cpt);
		cpt = 0;
	}
}

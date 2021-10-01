package org.but4reuse.adapters.softarchitectures.plugin_infos_extractor.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.but4reuse.adapters.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.softarchitectures.ServiceElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.ThisExpression;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;

public class RegisterServiceParser {
	
	private static List<ImportDeclaration> usedImports;
	private static  PackageDeclaration declaredPackage ;

	public static void main(String[] args){
		//parse("C:\\Users\\L-C\\Desktop\\Activator.java", new HashMap<String, VariableDeclarationFragment>(), new ArrayList<MethodInvocation>());
		/*for(int i = 0; i < 88; i++){
			System.out.println("------ Traitement de Activator"+i+".java -----");
			computeServiceElement("C:\\Users\\L-C\\Desktop\\Activators\\Activator"+i+".java");
			System.out.println("------ Fin de Activator"+i+".java -----");
		}
		*/
		
        File f = new File("C:\\Users\\kerdoudi\\AppData\\Local\\Temp\\archive_org.eclipse.osgi.source_3.12.50.v20170928-1321");

		
        List<InterfaceElement> requiredInterfaces = new ArrayList<InterfaceElement>();
        List<InterfaceElement> providedInterfaces = new ArrayList<InterfaceElement>();

		List<ServiceElement> consumedServiceElements = new ArrayList<ServiceElement>();
		
		List<ServiceElement> registeredServiceElements = new ArrayList<ServiceElement>();

		testparsing(f, requiredInterfaces,providedInterfaces, consumedServiceElements, registeredServiceElements);
		
		
		
		
		
		
		
		System.out.println("registered services");
		for (ServiceElement serviceElement : registeredServiceElements) {
			
			System.out.println("itf : "+serviceElement.getInterfaceName());
			System.out.println("obj : "+serviceElement.getObjName());
		}
		System.out.println("consumed services");
		for (ServiceElement serviceElement : consumedServiceElements) {
			
			System.out.println("itf : "+serviceElement.getInterfaceName());
			System.out.println("obj : "+serviceElement.getObjName());
		}
		
	/*	
		for(int i = 164; i < 400; i++){
			String[] res = findActivatorAndClassPath("C:\\Users\\L-C\\Desktop\\activatortest", i);
			
			if(res[0] != ""){
				System.out.println(res[1]+"  "+ i);
			//	computeRegisteredServiceElement(res[0], res[1]);
				
			}
			
		}*/
		
		

	}
	
	public static void testparsing(File f, List<InterfaceElement> requiredInterfaces, List<InterfaceElement> providedInterfaces, List<ServiceElement> consumedServiceElements,  List<ServiceElement> registeredServiceElements){
		
		
		//System.out.println(f.getAbsolutePath());
		if(f.isDirectory()){
			File[] listfiles = f.listFiles();
			for(File tmpf: listfiles){
				
				if(tmpf.isDirectory()){
					testparsing(tmpf,requiredInterfaces, providedInterfaces,consumedServiceElements, registeredServiceElements);
				}else if(tmpf.getName().endsWith(".java") && PluginInfosExtractor.existConsumedServParser(tmpf.getAbsolutePath())){
					System.out.println("Service Client Found"+tmpf.getAbsolutePath());
					//consumedServiceElements.addAll(RegisterServiceParser.computeConsumedServiceElement(tmpf.getAbsolutePath(), classpath,requiredInterfaces,consumedServiceElements));
					parserConsumed(tmpf.getAbsolutePath(), requiredInterfaces,consumedServiceElements);
					
				}

				 if(tmpf.getName().endsWith(".java") && PluginInfosExtractor.existRegisterParser(tmpf.getAbsolutePath())){
						System.out.println("Register Service  Found"+tmpf.getAbsolutePath());
						//consumedServiceElements.addAll(RegisterServiceParser.computeConsumedServiceElement(tmpf.getAbsolutePath(), classpath,requiredInterfaces,consumedServiceElements));
						parserRegister(tmpf.getAbsolutePath(), providedInterfaces,registeredServiceElements);
				}		
			}
		}
	}
	
	@SuppressWarnings("deprecation")
	private static void parserConsumed(String filePath, List<InterfaceElement> requiredInterfaces ,List<ServiceElement> consumedServiceElements) {

		
	
		List<MethodInvocation> invoclist = new ArrayList<MethodInvocation>();
		Map<String, String> assignmap = new HashMap<String, String>();
		Map<String, VariableDeclarationFragment> varmap = new HashMap<String, VariableDeclarationFragment>();

	//	parse(filepath, classpath, varmap, invoclist, assignmap);

		
		char[] source = convertFileIntoCharArray(filePath);
	    //    System.out.println("start from here :");
			@SuppressWarnings("deprecation")
			ASTParser parser = ASTParser.newParser(AST.JLS8);
		    parser.setKind(ASTParser.K_COMPILATION_UNIT);
		    String unitName = "Activator.java";
			parser.setUnitName(unitName);
	//	    String[] sources = {classpath};
	//		String[] classpaths = {classpath};
	 
	//		parser.setEnvironment(classpaths, sources, new String[] { "UTF-8"}, true);

		    parser.setSource(source);
		    parser.setResolveBindings(true);
		    CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		     declaredPackage = cu.getPackage();
		    usedImports = cu.imports();

		
		    cu.accept(new ASTVisitor(varmap, invoclist, assignmap));
		    
		    
			if(cu.types().size()>0){
				  if(cu.types().get(0) instanceof TypeDeclaration){
			        TypeDeclaration type = (TypeDeclaration) cu.types().get(0);
		    
		           FieldDeclaration[] fields = type.getFields();
			
		           for (FieldDeclaration fieldDeclaration : fields) {
		    	     List<VariableDeclarationFragment> fragments = fieldDeclaration.fragments();
		    	       for (VariableDeclarationFragment fieldFragment :fragments ) {
		    		     varmap.put(fieldFragment.getName().getFullyQualifiedName(), fieldFragment);
				       }
		           }
				  }
		    	 
			}
			for(MethodInvocation minvoc: invoclist){
				
				if(minvoc.getName().toString().equals("getServiceReference") || minvoc.getName().toString().equals("getServiceReferences")  ){
					String consumedInterfaceName = "";
		        	if(minvoc.arguments().size()>0){
		        		 @SuppressWarnings("unchecked")
		  			   List<Expression> args = minvoc.arguments();
					  if(minvoc.arguments().get(0)!=null){
						
						consumedInterfaceName = findInterface2(args.get(0), varmap);
					//	System.out.println("Consumed SERVICE: itf: "+consumedInterfaceName);
						if(!consumedInterfaceName.equals("")) {
							//TODO get the objname from the servelts list
						//	consumedServicesList.add(new ServiceElement(itf, obj));
						}
						
						 if(!consumedInterfaceName.equals("") && !consumedInterfaceName.startsWith("java.lang.")) {
							   InterfaceElement itfElement =null;

								   itfElement=findInterfaceElement(consumedInterfaceName,requiredInterfaces);
								   
								//TODO get the objname from declared getService
								if(!serviceAlreadyExists(consumedServiceElements,consumedInterfaceName, "")){
									   System.out.println("Consumed SERVICE  : itf: "+consumedInterfaceName+"\t obj: "+"");

									   consumedServiceElements.add(new ServiceElement(itfElement,consumedInterfaceName, ""));
										
										PluginInfosExtractor.nbserviceclients2++;
								}
						   }
						 
					
					  }
		        	}
				}
			}
		    
		    
		
	}

	
	
	private static void parserRegister(String filePath,List<InterfaceElement> providedInterfaces ,List<ServiceElement> registeredServiceElements) {

		
		
		List<MethodInvocation> invoclist = new ArrayList<MethodInvocation>();
		Map<String, String> assignmap = new HashMap<String, String>();
		Map<String, VariableDeclarationFragment> varmap = new HashMap<String, VariableDeclarationFragment>();

	//	parse(filepath, classpath, varmap, invoclist, assignmap);

		
		char[] source = convertFileIntoCharArray(filePath);
	    //    System.out.println("start from here :");
			@SuppressWarnings("deprecation")
			ASTParser parser = ASTParser.newParser(AST.JLS8);
		    parser.setKind(ASTParser.K_COMPILATION_UNIT);
		    String unitName = "Activator.java";
			parser.setUnitName(unitName);
	//	    String[] sources = {classpath};
	//		String[] classpaths = {classpath};
	 
	//		parser.setEnvironment(classpaths, sources, new String[] { "UTF-8"}, true);

		    parser.setSource(source);
		    parser.setResolveBindings(true);
		    CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		     declaredPackage = cu.getPackage();
		    usedImports = cu.imports();
		    cu.accept(new ASTVisitor(varmap, invoclist, assignmap));
		    
		    
		    
			for(MethodInvocation minvoc: invoclist){
				
				
				if(minvoc.getName().toString().equals("registerService")){
		    		
				   @SuppressWarnings("unchecked")
				   List<Expression> args = minvoc.arguments();
				   if(args.size()>=2){

					 String itf = findInterface2(args.get(0), varmap);
					 String obj = findObj(args.get(1), varmap, assignmap, filePath);
					
					  
					  // if it is String or Object or Boolean Character Double, so obj could has the same type as itf
					   if(obj.equals("") && itf.startsWith("java.lang.") &&  !ifIsNotInPackageJavaLang(itf.substring("java.lang.".length()))){
						obj = itf;
					   }
						
				//	   System.out.println("Registered SERVICE: itf: "+itf+"\t obj: "+obj);
					   		   
					  
					   if(!itf.equals("") || !obj.equals("")) {
						   InterfaceElement itfElement =null;
						   if(!itf.equals("") &&  !itf.startsWith("java.lang.")){
							   
							   itfElement=findInterfaceElement(itf,providedInterfaces);
							   
						   }
						   if(!serviceAlreadyExists(registeredServiceElements,itf, obj)){   
							   System.out.println("Registered SERVICE  : itf: "+itf+"\t obj: "+obj);

							   registeredServiceElements.add(new ServiceElement(itfElement,itf, obj));
								PluginInfosExtractor.nbservices2++;

						   }
					   }
				   }
				}
			}
			
		
		    
		    
		
	}
	public static String[] findActivatorAndClassPath(String folder, int i){
		String res[] = new String[2];
		File f = new File(folder);
		File cp = f.listFiles()[i];
		res[1] = cp.getAbsolutePath();
		res[0] = ActivatorPath(cp);
		return res;
		
	}
	
	public static String ActivatorPath(File f){
		if(f.isDirectory()){
			File[] listfiles = f.listFiles();
			for(File tmpf: listfiles){
				if(tmpf.isDirectory()){
					String res = ActivatorPath(tmpf);
					if(res != "") return res;
				}else if(tmpf.getName().contains("Activator.java")){
					return tmpf.getAbsolutePath();
				}
			}
		}
		return "";
	}
	
	public static List<ServiceElement> computeRegisteredServiceElement(String filepath, String classpath, List<InterfaceElement> providedInterfaces,List<ServiceElement> pluginRegisteredServices){
		Map<String, VariableDeclarationFragment> varmap = new HashMap<String, VariableDeclarationFragment>();
		List<MethodInvocation> invoclist = new ArrayList<MethodInvocation>();
		Map<String, String> assignmap = new HashMap<String, String>();
		
		parse(filepath, classpath, varmap, invoclist, assignmap);
		
		//List<ServiceElement> registeredServices = new ArrayList<>();
		
		for(MethodInvocation minvoc: invoclist){
			
			
			if(minvoc.getName().toString().equals("registerService")){
	    		
			   @SuppressWarnings("unchecked")
			   List<Expression> args = minvoc.arguments();
			   if(args.size()>=2){

				 String itf = findInterface2(args.get(0), varmap);
				 String obj = findObj(args.get(1), varmap, assignmap, filepath);
				
				  
				  // if it is String or Object or Boolean Character Double, so obj could has the same type as itf
				   if(obj.equals("") && itf.startsWith("java.lang.") &&  !ifIsNotInPackageJavaLang(itf.substring("java.lang.".length()))){
					obj = itf;
				   }
					
			//	   System.out.println("Registered SERVICE: itf: "+itf+"\t obj: "+obj);
				   		   
				  
				   if(!itf.equals("") || !obj.equals("")) {
					   InterfaceElement itfElement =null;
					   if(!itf.equals("") &&  !itf.startsWith("java.lang.")){
						   
						   itfElement=findInterfaceElement(itf,providedInterfaces);
						   
					   }
					   if(!serviceAlreadyExists(pluginRegisteredServices,itf, obj)){   
						   System.out.println("Registered SERVICE  : itf: "+itf+"\t obj: "+obj);

						   pluginRegisteredServices.add(new ServiceElement(itfElement,itf, obj));
							PluginInfosExtractor.nbservices2++;

					   }
				   }
			   }
			}
		}
		return pluginRegisteredServices;
	}
	
	
	public static InterfaceElement findInterfaceElement(String itf,List<InterfaceElement> interfaces ) {
		
		
			for (InterfaceElement itfElm : interfaces) {
				if(itfElm.getInterfaceName().equals(itf))
					return itfElm;
			}
		return null;
	}


	public static List<ServiceElement> computeConsumedServiceElement(String filepath, String classpath, List<InterfaceElement> requiredInterfaces,List<ServiceElement> pluginConsumedServices){
		Map<String, VariableDeclarationFragment> varmap = new HashMap<String, VariableDeclarationFragment>();
		List<MethodInvocation> invoclist = new ArrayList<MethodInvocation>();
		Map<String, String> assignmap = new HashMap<String, String>();
		
		parse(filepath, classpath, varmap, invoclist, assignmap);
		
	//	List<ServiceElement> consumedServices = new ArrayList<>();
		
		for(MethodInvocation minvoc: invoclist){
			
			if(minvoc.getName().toString().equals("getServiceReference") || minvoc.getName().toString().equals("getServiceReferences")  ){
				String consumedInterfaceName = "";
	        	if(minvoc.arguments().size()>0){
	        		 @SuppressWarnings("unchecked")
	  			   List<Expression> args = minvoc.arguments();
				  if(minvoc.arguments().get(0)!=null){
					
					consumedInterfaceName = findInterface2(args.get(0), varmap);
				//	System.out.println("Consumed SERVICE: itf: "+consumedInterfaceName);
					if(!consumedInterfaceName.equals("")) {
						//TODO get the objname from the servelts list
					//	consumedServicesList.add(new ServiceElement(itf, obj));
					}
					
					 if(!consumedInterfaceName.equals("") && !consumedInterfaceName.startsWith("java.lang.")) {
						   InterfaceElement itfElement =null;

							   itfElement=findInterfaceElement(consumedInterfaceName,requiredInterfaces);
							   
							//TODO get the objname from declared getService
							if(!serviceAlreadyExists(pluginConsumedServices,consumedInterfaceName, "")){
								   System.out.println("Consumed SERVICE  : itf: "+consumedInterfaceName+"\t obj: "+"");

								   pluginConsumedServices.add(new ServiceElement(itfElement,consumedInterfaceName, ""));
									
									PluginInfosExtractor.nbserviceclients2++;
							}
					   }
					 
				
				  }
	        	}
			}
		}
		// TODO  get the objname from declared variables in client plugin
	/*	for (ServiceElement serviceElement : consumedServices) {
			
			String objName="";
			
			for (ServiceElement serviceElement2 : registeredServices) {
				if(serviceElement.getInterfaceElement().getInterfaceName().equals(serviceElement2.getInterfaceElement().getInterfaceName())){
					objName=serviceElement2.getObjName();
				}
			}
			serviceElement.setObjName(objName);
		}
		*/
		return pluginConsumedServices;
	}
	
	public static boolean serviceAlreadyExists(List<ServiceElement> services,String interfaceName, String objName) {
		for (ServiceElement serviceElement : services) {
			
			if(!interfaceName.equals("") && !objName.equals("")){
				
				if(serviceElement.getInterfaceName().equals(interfaceName) && serviceElement.getObjName().equals(objName)) {
					 return true;
				 }
				
			}
			
			if(!interfaceName.equals("")) {
			 if(serviceElement.getInterfaceName().equals(interfaceName)) {
				 return true;
			 }
			}
			else {
				if(serviceElement.getObjName().equals(objName)) {
					 return true;
				 }
			}
		}
		return false;
	}


	private static String getObjName(List<MethodInvocation> invoclist) {
		
		// la solution banal
		for(MethodInvocation minvoc: invoclist){

		   if(minvoc.getName().toString().equals("registerService")){
			
		   }
		}
		return null;
	}


	/**
	 * 
	 * @param arg
	 * @param varmap
	 * @return
	 * @author kerdoudi
	 */
	private static String findInterface2(Expression arg, Map<String, VariableDeclarationFragment> varmap) {
		
		 String itf = getRegistredInterfaceName(arg, varmap);
		 if (itf == null){
			 return "";
		 }
		 
		 
		 for (ImportDeclaration usedImport : usedImports) {
				
				if(usedImport.getName().toString().endsWith("."+itf) ||  usedImport.getName().toString().equals(itf)){
					if(usedImport.getName().toString().equals("org.eclipse.core.runtime.internal.adaptor.org.osgi.service.packageadmin.PackageAdmin"))
						System.out.println("I'm here in - RegisterServiceParser.java");
					return usedImport.getName().toString();
					
				}
		 }
		 if(itf.contains(".")){
			 return itf;
		 }
		 if(ifIsNotInPackageJavaLang(itf)){
			  return declaredPackage.getName().toString()+"."+itf;
		 }
			else{
				 return "java.lang."+itf;
						
		 }
	}


	/**
	 * For example Object,Byte,Character....
					
	 * @param actual
	 * @return
	 * @author kerdoudi
	 */
		private static boolean ifIsNotInPackageJavaLang(String actual) {
			
			if(actual.equals("Object") || actual.equals("Boolean") || actual.equals("Character") || actual.equals("Double") || actual.equals("String")   )
			return false;
			
			return true;
			
		}
	public static String getRegistredInterfaceName(Expression arg,Map<String, VariableDeclarationFragment> varmap) {
		
		
			if(arg instanceof  MethodInvocation) 
			{
				MethodInvocation argAsMethodInvocation= (MethodInvocation) arg;
	
				if(argAsMethodInvocation.toString().endsWith(".class.getName()")){
				   String firstPartOfArgName = argAsMethodInvocation.toString().substring(0,argAsMethodInvocation.toString().indexOf(".class.getName()"));
    				return firstPartOfArgName;
				}
			}
			if(arg instanceof  TypeLiteral) 
			{    TypeLiteral argAsTypeLiteral= (TypeLiteral) arg;
				 if(argAsTypeLiteral.toString().endsWith(".class")){
					String firstPartOfArgName = argAsTypeLiteral.toString().substring(0,argAsTypeLiteral.toString().indexOf(".class"));
					return firstPartOfArgName;
			     }
			     else{
			    	 String name = ((SimpleName)arg).getFullyQualifiedName();
			    	 if(varmap.containsKey(name)){
							VariableDeclarationFragment vdf = varmap.get(name);
							Expression exprinit = vdf.getInitializer();
							if(exprinit instanceof StringLiteral){
								return ((StringLiteral)exprinit).getLiteralValue();
							}
					}
			     }
			}
			
		/*	if(arg instanceof StringLiteral){
				return ((StringLiteral)arg).getLiteralValue();
			}
			*/
			/* TODO
			if(arg instanceof   QualifiedName) // sharedAgent.registerService(IProvisioningAgent.SHARED_CURRENT_AGENT,currentAgent)
				
			if(arg instanceof   SimpleName)	//targetAgent.registerService(PROP_P2_PROFILE,profileId)
			if(arg instanceof   StringLiteral)	//agent.registerService("FORCED_SELF",profileId)
			if(arg instanceof   ArrayCreation) //	bc.registerService(new String[]{ThreadPoolManager.class.getName(),ThreadPoolFactory.class.getName()},thMan,null)
           */
										
			return null;
		}
	
	
	
	
	public static String findInterface(Expression expr, Map<String, VariableDeclarationFragment> varmap){
		//si l'argument est directement le string d'une interface
		if(expr instanceof StringLiteral){
			return ((StringLiteral)expr).getLiteralValue();
		} else if(expr instanceof MethodInvocation && expr.toString().contains(".class.getName()")){
			//dans le cas o� on effectue un "NomClass.class.getName()"
			MethodInvocation tmpmi = (MethodInvocation)expr;
			Expression tmpexpr = tmpmi.getExpression();
			if(tmpexpr instanceof TypeLiteral){
				Type t = ((TypeLiteral)tmpexpr).getType();
				ITypeBinding itb = t.resolveBinding();
				return itb!=null?itb.getQualifiedName():"";
			}
		} else if (expr instanceof TypeLiteral && expr.toString().contains(".class")){
			Type t = ((TypeLiteral)expr).getType();
			ITypeBinding itb = t.resolveBinding();
			return itb!=null?itb.getQualifiedName():"";
		} else if (expr instanceof SimpleName){
			String name = ((SimpleName)expr).getFullyQualifiedName();
			if(varmap.containsKey(name)){
				VariableDeclarationFragment vdf = varmap.get(name);
				Expression exprinit = vdf.getInitializer();
				if(exprinit instanceof StringLiteral){
					return ((StringLiteral)exprinit).getLiteralValue();
				}
			}
		}
		
		return "";
	}
	
	public static String findObj(Expression expr, Map<String, VariableDeclarationFragment> varmap, Map<String, String> assignmap, String path){
		if(expr instanceof SimpleName){
			String var = ((SimpleName)expr).getFullyQualifiedName();
			if(assignmap.containsKey(var)) return assignmap.get(var);
			
			VariableDeclarationFragment vdf = varmap.get(var);
			if(vdf == null){
				return "";
			}

			if(vdf.getInitializer() instanceof ClassInstanceCreation){
				ClassInstanceCreation cic = (ClassInstanceCreation)vdf.getInitializer();
				Type t = cic.getType();
				ITypeBinding itb = t.resolveBinding();
				return itb!=null?itb.getQualifiedName():"";
			}
			
			//si non instancie
			if(vdf.getParent() instanceof VariableDeclarationStatement){
				VariableDeclarationStatement vds = (VariableDeclarationStatement)vdf.getParent();
				Type t = vds.getType();
				ITypeBinding itb = t.resolveBinding();
				return itb!=null?itb.getQualifiedName():"";
			}

			
		} else if (expr instanceof ClassInstanceCreation){
			//si l'argument est directement "new Class()"
			ClassInstanceCreation cic = (ClassInstanceCreation)expr;
			Type t = cic.getType();
			ITypeBinding itb = t.resolveBinding();
			return itb!=null?itb.getQualifiedName():"";
		} else if (expr instanceof ThisExpression){
			ITypeBinding itb = ((ThisExpression)expr).resolveTypeBinding();
			return itb!=null?itb.getQualifiedName():"";
		} else if(expr instanceof MethodInvocation){
			MethodInvocation mi = ((MethodInvocation)expr);	
			ITypeBinding itb = mi.resolveTypeBinding();;
			return itb!=null?itb.getQualifiedName():"";

			
		}
		return "";
	}
	
	public static void parse(String filepath, String classpath, Map<String, VariableDeclarationFragment> varmap, List<MethodInvocation> invoclist, Map<String, String> assignmap){
		char[] source = convertFileIntoCharArray(filepath);
    //    System.out.println("start from here :");
		@SuppressWarnings("deprecation")
		ASTParser parser = ASTParser.newParser(AST.JLS8);
	    parser.setKind(ASTParser.K_COMPILATION_UNIT);
	    String unitName = "Activator.java";
		parser.setUnitName(unitName);
	    String[] sources = {classpath};
		String[] classpaths = {classpath};
 
		parser.setEnvironment(classpaths, sources, new String[] { "UTF-8"}, true);

	    parser.setSource(source);
	    parser.setResolveBindings(true);
	    CompilationUnit cu = (CompilationUnit) parser.createAST(null);
	     declaredPackage = cu.getPackage();
	    usedImports = cu.imports();
	    cu.accept(new ASTVisitor(varmap, invoclist, assignmap));
	}
	
	
	
	
	public static char[] convertFileIntoCharArray(String filename){
		List<Character> l = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;
		String s;
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			s = br.readLine();
			while(s != null){
				for(int i = 0; i < s.length(); i++){
					l.add(s.charAt(i));
				}
				l.add(new Character('\n'));
				s = br.readLine();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return convertCharacterListIntoChar(l);
	}
	
	public static char[] convertCharacterListIntoChar(List<Character> chars){
		char[] sources = new char[chars.size()];
		for(int i = 0; i < sources.length; i++){
			sources[i] = chars.get(i).charValue();
		}
		return sources;
	}
}

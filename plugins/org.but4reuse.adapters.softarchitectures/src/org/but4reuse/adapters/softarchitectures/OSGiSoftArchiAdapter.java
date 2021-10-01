package org.but4reuse.adapters.softarchitectures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

import org.but4reuse.adaptedmodel.manager.AdaptedModelManager;
import org.but4reuse.adapters.IAdapter;
import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.plugin_infos_extractor.utils.DependenciesBuilder;
import org.but4reuse.adapters.softarchitectures.plugin_infos_extractor.utils.PluginInfosExtractor;
import org.but4reuse.adapters.softarchitectures.plugin_infos_extractor.utils.ZipExtractor;
import org.but4reuse.adapters.softarchitectures.sapl.synthesis.OsgiFeatureArchitectureCreator;
import org.but4reuse.archmodel.synthesis.IFeatureArchitectureSynthesis;
import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureVariantRecovery;
import org.but4reuse.archmodel.synthesis.helper.ArchtectureVariantRecoverHelper;
import org.but4reuse.utils.files.FileUtils;
import org.but4reuse.utils.workbench.WorkbenchUtils;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * Eclipse adapter
 * 
 * @author Fjorilda Gjermizi
 * @author Krista Drushku
 * @author Diana MALABARD
 * @author Jason CHUMMUN
 * 
 */
public class OSGiSoftArchiAdapter implements IAdapter {

	private URI rootURI;
	public static URI rootURIofVariants;

	public static boolean parseInterfaces = false;
	public static boolean parseServices = false;
	public static boolean parseExtensions = true;
	public static boolean parsePackages = false;
	

	/**
	 * key is : pluginSymbName_Version value: is a hashMap : key is the package
	 * name , value is a list of interfaces
	 */
	public static Map<String, HashMap<String, ArrayList<InterfaceElement>>> pluginsInterfaces = new HashMap<String, HashMap<String, ArrayList<InterfaceElement>>>();

	/**
	 * This method check if the artefact is adaptable with the EclipseAdapter
	 */

	@Override
	public boolean isAdaptable(URI uri, IProgressMonitor monitor) {
		File file = FileUtils.getFile(uri);
		if (file.isDirectory()) {
			File pluginsFolder = new File(
					file.getAbsolutePath() + File.separator + "eclipse" + File.separator + "plugins");

			File pluginsFolder1 = new File(file.getAbsolutePath() + File.separator + "plugins");
			return (pluginsFolder.exists() && pluginsFolder.isDirectory())
					|| (pluginsFolder1.exists() && pluginsFolder1.isDirectory());
		}
		return false;
	}

	Map<String, String> bundlesInfoLines;
	public static long analyzedPlugins = 0;

	/**
	 * Provides the atomic elements (plugins) this distribution is made of
	 * 
	 * @param uri
	 *            URI of the distribution
	 * @param monitor
	 */
	@Override
	public List<IElement> adapt(URI uri, IProgressMonitor monitor) {

		long start_adapting = java.lang.System.currentTimeMillis();
		System.out.println("start time " + new Date());
		List<IElement> elements = new ArrayList<IElement>();
		File file = FileUtils.getFile(uri);
		rootURI = file.toURI();
		rootURIofVariants = rootURI;
		// System.out.println("First URI "+uri.toString());
		// A hashmap of bundle symbolic names and the complete line in the
		// bundles.info file
		bundlesInfoLines = PluginInfosExtractor.createBundlesInfoMap(uri);

		PluginInfosExtractor.declarativeservices = 0;
		PluginInfosExtractor.clients4declarativeservices = 0;

		PluginInfosExtractor.nbservices = 0;
		PluginInfosExtractor.nbservices2 = 0;

		PluginInfosExtractor.nbserviceclients = 0;
		PluginInfosExtractor.nbserviceclients2 = 0;
		System.out.println("parseInterfaces" + parseInterfaces);
		System.out.println("parseServices" + parseServices);
		System.out.println("parseExtensions" + parseExtensions);
		System.out.println("parsePackages" + parsePackages);
		// start the containment tree traversal, with null as initial container
		System.out.println("start adapting");
		adapt(file, elements, null);

		addReqInterfacesFromRequireBundles(elements);

		/*
		 * // Create SA ISoftwareArchitectureVariantRecovery saVariantAlgo =
		 * ArchtectureVariantRecoverHelper.
		 * getSAVariantAlgoByName("Flat Org SA Variant Recovering");
		 * if(saVariantAlgo!=null){
		 * saVariantAlgo.recoverSoftwareArchitectureVariant(elements,file.
		 * getName(), new NullProgressMonitor()); }
		 */
		// Create SA
		
			List<ISoftwareArchitectureVariantRecovery> softwareArchitectureVariantCreators = ArchtectureVariantRecoverHelper
					.getSelectedSoftwareArchitectureVariantCreators();
			for (ISoftwareArchitectureVariantRecovery savc : softwareArchitectureVariantCreators) {
				System.out.println("soft architecture variant is created : " + file.getName());

			//	savc.recoverSoftwareArchitectureVariant(elements, file.getName(), new NullProgressMonitor());

			}
		
		// Get construction uri from user
		String out = "/projectName";
		IContainer output = AdaptedModelManager.getDefaultOutput();
		if (output != null) {
			out = output.getFullPath().toString();
		}
		// Refresh
		if (output != null) {
			WorkbenchUtils.refreshIResource(output);
		} else {
			WorkbenchUtils.refreshAllWorkspace();
		}

		// plugin dependencies
		long start = java.lang.System.currentTimeMillis();
		for (IElement elem : elements) {
			if (elem instanceof PluginElement) {
				PluginElement pe = (PluginElement) elem;
				// ActivatorServiceBundleExtractor.analyzeServicePlugin(pe);
				DependenciesBuilder.build(pe, elements);
			}
		}
		long end = java.lang.System.currentTimeMillis();
		long end_adapting = java.lang.System.currentTimeMillis();

		System.out.println("finish parsing the variant " + file.getName());

		return elements;
	}

	private void addReqInterfacesFromRequireBundles(List<IElement> elements) {
		Vector<IElement> createdElements = new Vector<IElement>();

		for (IElement elem : elements) {
			if (elem instanceof PluginElement) {
				PluginElement pe = (PluginElement) elem;

				for (String requiredBundle : pe.getRequire_Bundles()) {
					// TODO check the version
					Set<String> keys = pluginsInterfaces.keySet();
					for (String key : keys) {
						if (key.startsWith(pe.getSymbName() + "_")) {
							HashMap<String, ArrayList<InterfaceElement>> pluginInterfaces = pluginsInterfaces.get(key);
							Set<String> packageNames = pluginInterfaces.keySet();

							for (String packageName : packageNames) {
								ArrayList<InterfaceElement> interfaces = pluginInterfaces.get(packageName);
								// Check if the package element is already exist
								PackageElement packageElement = null;
								if (OSGiSoftArchiAdapter.parsePackages) {
									packageElement = new PackageElement(packageName);
									createdElements.add(packageElement);
									pe.getImport_packages().add(packageElement);
								}

								for (InterfaceElement interfaceElement : interfaces) {
									// String interfaceName =
									// interfaceElm.getInterfaceName();
									// InterfaceElement interfaceElement = new
									// InterfaceElement(interfaceName);
									if (!interfaceIsExists(pe.getRequiredInterfaces(),
											interfaceElement.getInterfaceName())) {
										pe.getRequiredInterfaces().add(interfaceElement);
										createdElements.add(interfaceElement);
										if (packageElement != null) {
											packageElement.getInterfaces().add(interfaceElement);
										}

									}

									// elements.add(packageElement);
									// associate the interface to the
									// serviceElement it exists
								}
							}
						}

					}

				}
			}
		}

	}

	public static boolean interfaceIsExists(List<InterfaceElement> interfaces, String interfaceName) {

		for (InterfaceElement interfaceElement1 : interfaces) {
			if (interfaceElement1.getInterfaceName().equals(interfaceName))
				return true;
		}
		return false;
	}

	/**
	 * adapt recursively
	 * 
	 * @param file
	 * @param elements
	 * @param container
	 */
	private void adapt(File file, List<IElement> elements, IElement container) {
		FileElement newElement = null;

		if (PluginInfosExtractor.isAPlugin(file)) {

			System.out.println("====> Is a Plugin : " + file.getName());
			try {
				analyzedPlugins++;
				// Unzipped plugin
				if (file.isDirectory()) {
					newElement = PluginInfosExtractor
							.getPluginInfosFromManifest(file.getAbsolutePath() + "/META-INF/MANIFEST.MF", elements);
					// System.out.println("PATH "+file.getAbsolutePath());
					newElement.setUri(file.toURI());
				} else {
					// Jar plugin
					newElement = PluginInfosExtractor.getPluginInfosFromJar(file.getAbsolutePath(), elements);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			if (newElement != null) {

				// Set the relevant information
				newElement.setUri(file.toURI());
				newElement.setRelativeURI(rootURI.relativize(file.toURI()));

				// Add dependency to the parent folder
				if (container != null) {
					newElement.addDependency("container", container);
				}

				// Add the bundles info
				if (newElement instanceof PluginElement) {
					PluginElement plugin = (PluginElement) newElement;
					String line = bundlesInfoLines.get(plugin.getSymbName());
					// in the case of source code plugins, line will be null but
					// no
					// problem
					plugin.setBundleInfoLine(line);

					// if (plugin.getName() == null ||
					// plugin.getName().contains("%")) {
					// System.out.println("EclipseAdapter.adapt() No name found:
					// " +
					// " isFragment:" + plugin.isFragment()
					// + " " + plugin.getSymbName() + " at " +
					// file.getAbsolutePath());
					// }

				}

				// Add to the list
				// addElement(elements, newElement);

			}
		} else {// Is NOT a Plugin file
			// System.err.println("====> Is NOT a Plugin :" + file);

			if (file.isDirectory()) {
				// Exclude the features folder

				// trouver tous les interfaces et les sauvegarder dans un map
				if (parseInterfaces) {
					if (file.getName().equals("plugins") || file.getName().equals("dropins")) {

						System.out.println("identify interfaces: this step takes few minutes");
						File[] files = file.listFiles();
						for (File pluginFile : files) {
							if (PluginInfosExtractor.isAPlugin(pluginFile)) {
								// key represents : pluginSymN+"_"+pluginVersion
								HashMap<String, ArrayList<InterfaceElement>> pluginInterfaces = new HashMap<String, ArrayList<InterfaceElement>>();

								String pluginSymN = getSymName(pluginFile);
								String pluginVersion = getPluginVersion(pluginFile);

								pluginsInterfaces.put(pluginSymN + "_" + pluginVersion, pluginInterfaces);
								identifyInterfaces(pluginFile, pluginInterfaces);
							}
						}
						System.out.println("finish identifying interfaces");

					}
				}
				// Go for the files in case of folder
				// if (file.isDirectory()) {
				// // Exclude the features folder
				// if
				// (!newElement.getRelativeURI().toString().equals("features/"))
				// {
				// File[] files = file.listFiles();
				// for (File subFile : files) {
				// adapt(subFile, elements, newElement);
				// }
				// }
				// }
				File[] files = file.listFiles();
				if (files != null) {
					for (File subFile : files) {
						adapt(subFile, elements, newElement);
					}
				}

			}

			// if (file.isDirectory())
			// newElement = new FileElement();
		}
	}

	private String getPluginVersion(File subFile) {

		if (subFile.isDirectory()) {

			String manifestFile = subFile.getAbsolutePath() + "/META-INF/MANIFEST.MF";

			try {
				InputStream ips = new FileInputStream(manifestFile);
				Manifest manifest = new Manifest(ips);

				Attributes attributes = manifest.getMainAttributes();
				return attributes.getValue("Bundle-Version");

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {

			// Jar plugin
			try {
				JarFile jar = new JarFile(subFile);
				Manifest manifest;
				manifest = jar.getManifest();

				Attributes attributes = manifest.getMainAttributes();
				return attributes.getValue("Bundle-Version");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "";
	}

	private String getSymName(File subFile) {

		if (subFile.isDirectory()) {

			String manifestFile = subFile.getAbsolutePath() + "/META-INF/MANIFEST.MF";

			try {
				InputStream ips = new FileInputStream(manifestFile);
				Manifest manifest = new Manifest(ips);

				Attributes attributes = manifest.getMainAttributes();
				String symName = attributes.getValue("Bundle-SymbolicName");
				int i = symName.indexOf(';');
				if (i != -1)
					symName = symName.substring(0, i);

				return symName;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {

			// Jar plugin
			try {
				JarFile jar = new JarFile(subFile);

				Manifest manifest;

				manifest = jar.getManifest();

				Attributes attributes = manifest.getMainAttributes();
				String symName = attributes.getValue("Bundle-SymbolicName");
				int i = symName.indexOf(';');
				if (i != -1)
					symName = symName.substring(0, i);
				return symName;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "";
	}

	private void identifyInterfaces(File file, Map<String, ArrayList<InterfaceElement>> packInterfaces) {

		// System.out.println(file.getAbsolutePath());
		String PATH = file.getAbsolutePath();
		if (PATH.endsWith(".jar")) {
			// System.out.println(file.getAbsolutePath());

			try {
				long start = java.lang.System.currentTimeMillis();
				ZipExtractor.unZipAll(new File(PATH), new File(PATH.substring(0, PATH.length() - 4)));
				long end = java.lang.System.currentTimeMillis();
				// System.out.println("Extraction "+ printTime(end-start) );
				PluginInfosExtractor.extraction += (end - start);
				PATH = PATH.substring(0, PATH.length() - 4);
				file = new File(PATH);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		if (file.isDirectory()) {
		//	 System.out.println(file.getAbsolutePath());

			for (File f : file.listFiles()) {
				// System.out.println("......."+f.getAbsolutePath());

				if (f.getAbsolutePath().endsWith(".class") && !f.getAbsolutePath().contains("$")) {

					try {

						FileInputStream fis = new FileInputStream(f);

						// TODO check if fis is an interface and is not a class
						if (fis != null) {
							ClassReader cr = new ClassReader(fis);
							ClassNode cn = new ClassNode();

							cr.accept(cn, 0);
							// is interface
							if ((cn.access & Opcodes.ACC_INTERFACE) != 0) {

								String n = cr.getClassName();
								n = n.replaceAll("/", ".");
								String[] words = n.split("\\.");
								// System.out.println(words.length);

								String packageName = "";
								if (words.length > 1) {
									packageName = n.substring(0, n.length() - words[words.length - 1].length() - 1);
								}

								// add required interfaces

								if (!packageName.isEmpty()) {
									ArrayList<InterfaceElement> interfaces = packInterfaces.get(packageName);

									// TODO hash map key interface name
									if (interfaces == null) {
										interfaces = new ArrayList<InterfaceElement>();
										packInterfaces.put(packageName, interfaces);
									} // test n
									if (!interfaceIsExists(interfaces, n)) {
										List<MethodNode> methods = cn.methods;

										InterfaceElement itfElm = new InterfaceElement(n);
										itfElm.setInterfaceName(n);
										for (MethodNode mn : methods) {
											// System.out.println("- Méthode
											// analysée : "+mn.name+"
											// "+mn.desc);
											if (mn.name != null) {
												itfElm.getOperations().add(mn.name);
											}
										}

										interfaces.add(itfElm);
									}
								}
							}
							fis.close();
						}
						//
					} catch (FileNotFoundException e) {
						System.err.println(f.getAbsolutePath());

						e.printStackTrace();
					} catch (IOException e) {
						System.err.println(f.getAbsolutePath());
						e.printStackTrace();
					}
					catch (IllegalArgumentException e) {
			            System.out.println("can not read the file"+f.getAbsolutePath());		
			            
					}
					catch(ArrayIndexOutOfBoundsException e){
						System.out.println("ArrayIndexOutOfBoundsException: 0");
					}


				} else
					identifyInterfaces(f, packInterfaces);
			}
		}

	}

	private boolean isInterface(File file) {

		Scanner sc = null;
		try {
			sc = new Scanner(file);
			String currentLine = "";
			while (sc.hasNextLine()) {
				currentLine = sc.nextLine();
				if (currentLine.contains(" interface ")) {
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

		return false;

	}

	/**
	 * This method was created just to be overriden by the benchmark adapter
	 * 
	 * @param elements
	 * @param newElement
	 */
	protected void addElement(List<IElement> elements, FileElement newElement) {
		elements.add(newElement);
	}

	@Override
	public void construct(URI uri, List<IElement> elements, IProgressMonitor monitor) {
		boolean constructBundlesInfo = false;
		String bundlesInfoContent = "#version=1\n";
//		System.out.println("start constucting");
		IFeatureArchitectureSynthesis architectureCreator = new OsgiFeatureArchitectureCreator();
		String blockName = "block";
		File blockArchFolderFile = null;
		for (IElement element : elements) {
			// check user cancel for each element
			if (!monitor.isCanceled()) {
				// provide user info
				monitor.subTask(element.getText());
				if (element instanceof FileElement) {
					FileElement fileElement = (FileElement) element;
					if(fileElement!=null){
						
						if (fileElement.getRelativeURI().toString().equals(PluginInfosExtractor.BUNDLESINFO_RELATIVEPATH)) {
							constructBundlesInfo = true;
						}	
					}
					try {
						// Create parent folders structure
						URI newDirectoryURI = uri.resolve(fileElement.getRelativeURI());
						File destinationFile = FileUtils.getFile(newDirectoryURI);
						if (destinationFile != null && !destinationFile.getParentFile().exists()) {
							destinationFile.getParentFile().mkdirs();
						}
						if (destinationFile != null && !destinationFile.exists()) {
							// Copy the content. In the case of a folder, its
							// content is not copied

							File file = FileUtils.getFile(fileElement.getUri());
							Files.copy(file.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
							int secondPart =0;
                            if(destinationFile.getAbsolutePath().contains("eclipse" + File.separator + "plugins")) {
                            	secondPart = destinationFile.getAbsolutePath().indexOf("eclipse" + File.separator + "plugins");
                            }
                            else if (destinationFile.getAbsolutePath().contains("plugins")) {
                            	secondPart = destinationFile.getAbsolutePath().indexOf("plugins");
                           }
                            if(secondPart!=0){
								String blockArchFolder = destinationFile.getAbsolutePath().substring(0, secondPart );
								blockArchFolderFile = new File(blockArchFolder);
								blockName = blockArchFolderFile.getName();
                            }
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				// prepare the bundles.info configuration file
				// just in case we need to construct it
				if (element instanceof PluginElement) {
					PluginElement pluginElement = (PluginElement) element;
					String line = pluginElement.getBundleInfoLine();
					if (line != null) {
						String[] lineFields = line.split(",");
						bundlesInfoContent += pluginElement.getSymbName() + ",";
						bundlesInfoContent += pluginElement.getVersion() + ",";
						bundlesInfoContent += pluginElement.getRelativeURI() + ",";
						bundlesInfoContent += lineFields[3] + ",";
						bundlesInfoContent += lineFields[4] + "\n";
					}
				}

			}

			monitor.worked(1);
		}
		// Replace bundles.info content
		if (constructBundlesInfo) {
			try {
				File tmpFile = File.createTempFile("tempBundles", "info");
				FileUtils.appendToFile(tmpFile, bundlesInfoContent);
				File file = FileUtils.getFile(uri);
				File bundlesInfo = new File(
						file.getAbsolutePath() + "/" + PluginInfosExtractor.BUNDLESINFO_RELATIVEPATH);
				FileUtils.replace(bundlesInfo, tmpFile);
				tmpFile.deleteOnExit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (blockArchFolderFile != null) {
			architectureCreator.createFeatureArchitecture(blockName, elements, blockArchFolderFile.getAbsolutePath());
		}
		// calcaluteFeaturePrecisionRecall(b,blocksArchitecturesFolder1,AdaptedModelManager.getAdaptedModel().getOwnedBlocks().size());

	}

	public static boolean isNotKeyWord(String s) {
		if (!s.equalsIgnoreCase("source") && !s.equalsIgnoreCase("org") && !s.equalsIgnoreCase("com")
				&& !s.equalsIgnoreCase("extension") && !s.equalsIgnoreCase("point") && !s.equalsIgnoreCase("java")
				&& !s.equalsIgnoreCase("string") && !s.equalsIgnoreCase("internal") && !s.equalsIgnoreCase("for")
				&& !s.equalsIgnoreCase("in") && !s.equalsIgnoreCase("ui"))

			return true;

		return false;
	}
	
	public static void main(String[] args) {
		
	File f = new File("C:\\outputrandomdistmod\\Variant_1\\plugins\\org.eclipse.jdt.compiler.tool_1.2.700.v20191001-0515\\lib\\java13api\\javax\\lang\\model\\SourceVersion.class");
		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
			if (fis != null) {
				System.out.println(fis);
				ClassReader cr = new ClassReader(fis);
				System.out.println("k dd");

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("k");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IllegalArgumentException e) {
            System.out.println("can not read the file"+f.getAbsolutePath());		
		}
		// TODO check if fis is an interface and is not a class
		System.out.println("k ddgg");

	}
	

	

}

package org.but4reuse.adapters.softarchitectures.plugin_infos_extractor.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.but4reuse.adapters.softarchitectures.ExtensionElement;
import org.but4reuse.adapters.softarchitectures.ExtensionPointElement;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PluginXMLParser {
	private  final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	private  DocumentBuilder docBuilder ;
	private  List<ExtensionPointElement> extensionPoints;
	private  List<ExtensionElement> extensions;
    private String pluginXMLPath;
	
	
	
	
	public PluginXMLParser(String path) {
		this.pluginXMLPath=path;
	}
	private void initialize(){
		
		if(docBuilder==null){
		
			try {
				docBuilder = factory.newDocumentBuilder();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public List<List<String>> getInformations() {
		
		initialize();
		
		List<List<String>> infos = new ArrayList<>();
		List<String> impl = new ArrayList<String>();
		
		Document doc;
		try {
			
			File f = new File(pluginXMLPath);
			
			if(f.canRead()){
				doc = docBuilder.parse(new File(pluginXMLPath));
				getExtPoints(doc);
				getExts(doc);

				
			}
			else
				return null;
			
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return infos;
	}
	
	/**
	 * get Extension Points
	 * @param doc
	 * @return
	 */
     private List<ExtensionPointElement> getExtPoints(Document doc){
		
		NodeList nodeList = doc.getElementsByTagName("extension-point");
   	     extensionPoints = new ArrayList<ExtensionPointElement>();
	
		
         for(int i=0; i<nodeList.getLength(); i++){
			
        	Node id = nodeList.item(i).getAttributes().getNamedItem("id");
        	Node name = nodeList.item(i).getAttributes().getNamedItem("name");
        	Node schema = nodeList.item(i).getAttributes().getNamedItem("schema");
        	String idValue="";
        	String nameValue="";
        	String schemaValue="";
        	if(id!=null){
        	   idValue = id.getNodeValue();
        	}
        	if(name!=null){
        	   nameValue = name.getNodeValue();
        	}
        	if(schema!= null){
        	   schemaValue =schema.getNodeValue();
        	}
       	    ExtensionPointElement extensionPointElement = new ExtensionPointElement(idValue,nameValue,schemaValue);
        	extensionPoints.add(extensionPointElement);
			
		}
		return extensionPoints;
	}
     /***
      * get Extensions
      * 
      * @param doc
      * @return
      */
     private List<ExtensionElement> getExts(Document doc){
 		
 		NodeList nodeList = doc.getElementsByTagName("extension");
    	     extensions = new ArrayList<ExtensionElement>();
 	
 		
          for(int i=0; i<nodeList.getLength(); i++){
 			
         	Node point = nodeList.item(i).getAttributes().getNamedItem("point");
         
         	String pointValue="";
         	
         	if(point!=null){
         		pointValue = point.getNodeValue();
         	}
         	
        	    ExtensionElement extensionElement = new ExtensionElement(pointValue);
         	extensions.add(extensionElement);
 			
 		}
 		return extensions;
 	}

	public List<ExtensionPointElement> getExtensionPoints() {
		return extensionPoints;
	}

	public List<ExtensionElement> getExtensions() {
		return extensions;
	}
	
	public static void main(String[] args) {
		   File file =new File(java.lang.System.getProperty("user.home")+File.separator+"plugin.xml");

		PluginXMLParser  p= new PluginXMLParser(file.getAbsolutePath());
				p.getInformations();
		
		for (ExtensionPointElement exp : p.extensionPoints) {
			System.out.println(exp.getId());
			System.out.println(exp.getName());
			System.out.println(exp.getSchema());


		}
		for (ExtensionElement ex : p.extensions) {
			System.out.println(ex.getPoint());
			System.out.println(ex.getClassName());
		}
	}
}

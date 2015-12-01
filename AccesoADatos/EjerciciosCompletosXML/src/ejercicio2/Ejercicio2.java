package ejercicio2;
import java.io.FileOutputStream;

import org.jdom2.*;
import org.jdom2.output.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		try{
			Element root=new Element("documento");
			
			Element ejemplo=new Element("ejemplo");
			root.addContent(ejemplo);
			Element contenido=new Element("contenido");
			contenido.setText("Primera linea de ejemplo 1");
			Element contenido2=new Element("contenido");
			contenido2.setText("Segunda linea del ejemplo 1");
			Element contenido3=new Element("contenido");
			contenido3.setText("Tercera linea del ejemplo 1");
			ejemplo.addContent(contenido);
			ejemplo.addContent(contenido2);
			ejemplo.addContent(contenido3);
			
			Element ejemplo2=new Element("ejemplo");
			root.addContent(ejemplo2);
			Element contenido4=new Element("contenido");
			contenido4.setText("Primera linea de ejemplo 2");
			Element contenido5=new Element("contenido");
			contenido5.setText("Segunda linea del ejemplo 2");
			Element contenido6=new Element("contenido");
			contenido6.setText("Tercera linea del ejemplo  2");
			ejemplo2.addContent(contenido4);
			ejemplo2.addContent(contenido5);
			ejemplo2.addContent(contenido6);
			Document doc=new Document(root);
			
			new XMLOutputter().output(doc,System.out);
			new XMLOutputter().output(doc, new FileOutputStream("Ejercicio2.xml"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

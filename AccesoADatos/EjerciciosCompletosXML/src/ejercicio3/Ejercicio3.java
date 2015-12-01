package ejercicio3;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		try{
			SAXBuilder builder=new SAXBuilder();
			Document doc=builder.build("Ejercicio2.xml");
			Element root=doc.getRootElement();
			
			System.out.println("La raiz del documento es: "+root.getName());
			List<Element> ejemplo=root.getChildren();
			System.out.println("El nombre del elemento es: "+ejemplo.get(0).getName());
			List<Element> contenido=ejemplo.get(0).getChildren();
			Iterator<Element> itcontenido=contenido.iterator();
			while(itcontenido.hasNext()){
				Element e=itcontenido.next();
				System.out.println("El nombre del elemento es: "+e.getName());
				System.out.println("El texto que contiene el elemento es: "+e.getText());
			}
			
			System.out.println("El nombre del elemento es: "+ejemplo.get(1).getName());
			contenido=ejemplo.get(1).getChildren();
			Iterator<Element> itcontenido2=contenido.iterator();
			while(itcontenido2.hasNext()){
				Element e=itcontenido2.next();
				System.out.println("El nombre del elemento es: "+e.getName());
				System.out.println("El texto que contiene el elemento es: "+e.getText());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

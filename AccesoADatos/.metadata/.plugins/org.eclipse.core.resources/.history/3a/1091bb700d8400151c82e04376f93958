package ejercicio4;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

import java.util.*;

public class Ejercicio4 {
	public static void main(String args[]){
		try{
			SAXBuilder builder=new SAXBuilder();
			Document doc=builder.build("Ejercicio4.xml");
			Element root=doc.getRootElement();
			List<Element> elementos=root.getChildren();
			/*1.añadir a comida una etiqueta llamada extras 
			 * con atributo postres caros*/
			Iterator it=elementos.iterator();
			while(it.hasNext()){
				Element extras=new Element("extras");
				extras.setAttribute("postres","caros");
				Element comida=(Element)it.next();
				comida.addContent(extras);
			}
			new XMLOutputter().output(doc,System.out);
			
			/*2. añadir una nueva etiqueta Nombre1 en todos los tiposplatos*/
			System.out.println("\nSegunda parte \n");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

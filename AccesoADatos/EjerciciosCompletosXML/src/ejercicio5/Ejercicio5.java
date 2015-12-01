package ejercicio5;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.*;
import java.util.*;
public class Ejercicio5 {
	public static void main(String[] args){
		try{
			SAXBuilder builder=new SAXBuilder();
			Document doc=builder.build("Ejercicio4.xml");
			
			new XMLOutputter().output(doc, System.out);
			
			Element root=doc.getRootElement();
			System.out.println("<"+root.getName()+">");
			Element profesores=root.getChild("profesores");
			System.out.println("\t<"+profesores.getName()+">");
			List<Element> datos=profesores.getChildren();
			Iterator<Element> it=datos.iterator();
			while(it.hasNext()){
				Element e=it.next();
				System.out.println("\t\t<"+e.getName()+">"+e.getText()+"</"+e.getName()+">");
			}
			System.out.println("\t</"+profesores.getName()+">");
			System.out.println("</"+root.getName()+">");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

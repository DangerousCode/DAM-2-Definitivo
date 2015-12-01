package escribiryleer;

import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.*;
import java.util.*;

public class Ejercicio1Leer {
	public static void main(String args[]) throws JDOMException, IOException{
		SAXBuilder builder=new SAXBuilder();
		Document doc=builder.build("PracticaXML.xml");
		Element root=doc.getRootElement();
		System.out.println("<"+root.getName()+">");
		
		Element personajes=root.getChild("personajes");
		System.out.println("\t<"+personajes.getName()+">");
		
		List<Element> personaje=personajes.getChildren();
		Iterator<Element> itpers=personaje.iterator();
		while(itpers.hasNext()){
			Element e=itpers.next();
			System.out.println("\t\t<"+e.getName()+" "+e.getAttribute("especie")+" "+e.getAttribute("id")+">"+e.getText());
		}
		
		Element autores=root.getChild("autores");
		System.out.println("\t<"+autores.getName()+">");
		Element dibujantes=autores.getChild("dibujantes");
		
		System.out.println("\t\t<"+dibujantes.getName()+">");
		
		List<Element> dibujante=dibujantes.getChildren();
		Iterator<Element> itdib=dibujante.iterator();
		while(itdib.hasNext()){
			Element dib=itdib.next();
			System.out.println("\t\t\t<"+dib.getName()+" "+dib.getAttribute("id"));
			List<Element> dibdat=dib.getChildren();
			Iterator<Element> itdibdat=dibdat.iterator();
			while(itdibdat.hasNext()){
				Element dato=itdibdat.next();
				System.out.println("\t\t\t\t<"+dato.getName()+">"+dato.getText());
			}
		}
		
		Element guionistas=autores.getChild("guionistas");
		System.out.println("\t<"+guionistas.getName()+">");
		Element guionista=guionistas.getChild("guionista");
		System.out.println("\t\t<"+guionista.getName()+" "+guionista.getAttribute("id")+">");
		List<Element> guidat=guionista.getChildren();
		Iterator<Element> itgui=guidat.iterator();
		while(itgui.hasNext()){
			Element dat=itgui.next();
			System.out.println("\t\t\t<"+dat.getName()+">"+dat.getText());
		}
	}
}

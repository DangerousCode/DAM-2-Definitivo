package ejercicios;

import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

import java.util.*;

public class Ejercicio3 {
	public static void main(String args[]) throws JDOMException, IOException{
		SAXBuilder builder=new SAXBuilder();
		Document doc=builder.build("PracticaXML.xml");
		
		Element root=doc.getRootElement();
		
		Element autores=root.getChild("autores");
		Element dibujantes=autores.getChild("dibujantes");
		
		List<Element> dibujante=dibujantes.getChildren();
		Iterator<Element> itdib=dibujante.iterator();
		while(itdib.hasNext()){
			Element e=itdib.next();
			if(e.getChild("nacimientoPais").getText().equals("Belgica")){
				e.getChild("nacimientoFecha").setText("1995");
			}
		}
		
		new XMLOutputter().output(doc, System.out);
	}
}

package ejercicios;

import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class Ejercicio2 {
	public static void main(String args[]) throws JDOMException, IOException{
		SAXBuilder builder=new SAXBuilder();
		Document doc=builder.build("PracticaXML.xml");
		
		Element root=doc.getRootElement();
		
		root.getChild("autores").setAttribute("famosos","SI");
		
		new XMLOutputter().output(doc, System.out);
	}
}

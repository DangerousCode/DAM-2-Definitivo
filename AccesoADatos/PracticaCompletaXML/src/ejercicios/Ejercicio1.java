package ejercicios;
import java.io.IOException;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;
public class Ejercicio1 {
	public static void main(String args[]) throws JDOMException, IOException{
		SAXBuilder builder=new SAXBuilder();
		Document doc=builder.build("PracticaXML.xml");
		
		Element root=doc.getRootElement();
		Element guionista=root.getChild("autores").getChild("guionistas").getChild("guionista");
		if(guionista.getAttributeValue("id").equals("G001")){
			guionista.removeChild("fallecimientoFecha");
		}
		else{
			System.out.println("El arbol esta mal estructurado");
		}
		
		new XMLOutputter().output(doc, System.out);
	}
}

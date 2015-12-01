package ejercicio2;

import java.util.List;
import java.util.*;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class Ejercicio2 {

	public static void main(String[] args) {
		try{
			SAXBuilder builder=new SAXBuilder();
			Document doc=builder.build("Ejercicio2.xml");
			Element root=doc.getRootElement();
			
			System.out.println(root);
			List<Element> elementos=root.getChildren("tipo");
			
					
			Iterator it= elementos.iterator();
			
			while(it.hasNext()){
				Element e=(Element)it.next();
				Element mueble=new Element("mueble");
				Element persianas=new Element("persianas");
				mueble.setText("muebles baratos");
				persianas.setText("De colores");
				e.addContent(mueble);
				e.addContent(persianas);
			}
			
			new XMLOutputter().output(doc,System.out);
			/*2. Cambiar la segunda etiqueta mueble*/
			System.out.println("\nSegunda parte\n");
			Element mueble2=elementos.get(1).getChild("mueble");
			mueble2.setText("muebles caros");
			new XMLOutputter().output(doc,System.out);
			
			/*3.Borrar la primera persiana que hab�is a�adido*/
			System.out.println("\nTercera parte\n");
			elementos.get(0).removeChild("persianas");
			new XMLOutputter().output(doc,System.out);
			
			/*4.A�adir un atributo a mueble donde el texto es muebles caros
<mueb		le tama�o=�extra�*/
			System.out.println("\nCuarta parte\n");
			Element muebleatributo=elementos.get(1).getChild("mueble");
			muebleatributo.setAttribute("tamanio","extra");
			new XMLOutputter().output(doc,System.out);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

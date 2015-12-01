package ejercicio7;

import java.io.FileOutputStream;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.*;

public class Ejercicio7Operaciones {
	public static void main(String[]args){
		try{
			SAXBuilder builder=new SAXBuilder();
			Document doc=builder.build("Ejercicio7.xml");
			Element root=doc.getRootElement();
			Element comida=root.getChild("comida");
			Element plato=comida.getChild("plato");
			
			Element precio=new Element("precio");
			precio.setText("5");
			plato.addContent(precio);
			
			//Segundo punto
			
			comida.setAttribute("tipo","barata");
			plato.getChild("nombre").setAttribute("clase","pasta");
			
			//Tercer punto
			
			comida.setName("platoprincipal");
			
			//Cuarto punto
			
			plato.getChild("ingredientes").setAttribute("cantidad", "al gusto");
			
			//Quinto punto
			
			comida.setText("Gazpacho");
			
			new XMLOutputter().output(doc, System.out);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

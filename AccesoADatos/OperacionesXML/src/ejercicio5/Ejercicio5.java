package ejercicio5;

import java.util.List;
import java.util.*;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class Ejercicio5 {
	public static void main(String args[]){
		try{
			SAXBuilder builder=new SAXBuilder();
			Document doc=builder.build("Ejercicio5.xml");
			Element root=doc.getRootElement();
			List<Element> elementos=root.getChildren();
			/*
			 * 1. Añadir una nueva plantilla formada por dos nuevos 
			 * jugadores con los nombres que vosotrosquerías
			 */
			Element plantilla=new Element("plantilla");
			Element nombre=new Element("nombre");
			nombre.setText("Benzema");
			plantilla.addContent(nombre);
			Element nombre2=new Element("nombre");
			nombre2.setText("Cristiano");
			plantilla.addContent(nombre2);
			
			elementos.get(0).addContent(plantilla);
			
			Element plantilla2=new Element("plantilla");
			Element nombre3=new Element("nombre");
			nombre3.setText("Manolo");
			plantilla2.addContent(nombre3);
			Element nombre4=new Element("nombre");
			nombre4.setText("Pedrini");
			plantilla2.addContent(nombre4);
			
			elementos.get(1).addContent(plantilla2);
			new XMLOutputter().output(doc,System.out);
			
			/*2. Cambiar las etiquetas hijas de árbitros y escribiremos colegiado uno
			 *  , colegiado dos*/
			System.out.println("\nSegunda parte\n");
			List<Element> arbitros=root.getChild("arbitros").getChildren();
			arbitros.get(0).setName("colegiadouno");
			arbitros.get(1).setName("colegiadodos");
			new XMLOutputter().output(doc,System.out);
			
			/*3. Cambiar el texto del presidente del Real Madrid y poner Florentino*/
			System.out.println("\nTercera parte\n");
			List<Element> equipos=root.getChildren("equipo");
			Iterator it=equipos.iterator();
			while(it.hasNext()){
				Element e=(Element)it.next();
				System.out.println(e.getChildText("presidente"));
				if(e.getChildText("presidente").equals("Mandamas")){
					e.getChild("presidente").setText("Florentino");
				}
			}
			new XMLOutputter().output(doc,System.out);
			
			//4. Buscar los equipos de fútbol que no tienen extranjeros
			System.out.println("\nCuarta parte\n");
			Iterator it2=equipos.iterator();
			while(it2.hasNext()){
				Element e=(Element)it2.next();
				if(e.getChild("conextranjeros")==null){
					System.out.println("El equipo "+e.getChildText("club")+" no tiene extranjeros");
				}
			}
			
			//5. Añadir a todos los equipos que no tengan la etiqueta </conextranjeros> dentro de su información 
			System.out.println("\nQuinta parte\n");
			Iterator it3=equipos.iterator();
			while(it3.hasNext()){
				Element e=(Element)it3.next();
				if(e.getChild("conextranjeros")==null){
					Element conextranjeros=new Element("conextranjeros");
					e.addContent(conextranjeros);
				}
			}
			new XMLOutputter().output(doc,System.out);
			
			//6. Modificar la valoración del Club que tenga un valor menor a 6 y ponemos un 10
			System.out.println("\nSexta parte\n");
			Iterator it4=equipos.iterator();
			while(it4.hasNext()){
				Element e=(Element)it4.next();
				Element club=e.getChild("club");
				if(Integer.parseInt(club.getAttributeValue("valoracion"))<6){
					club.setAttribute("valoracion", "10");
				}
			}
			new XMLOutputter().output(doc,System.out);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

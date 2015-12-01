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
			/*1.a�adir a comida una etiqueta llamada extras 
			 * con atributo postres caros*/
			Iterator it=elementos.iterator();
			while(it.hasNext()){
				Element extras=new Element("extras");
				extras.setAttribute("postres","caros");
				Element comida=(Element)it.next();
				comida.addContent(extras);
			}
			new XMLOutputter().output(doc,System.out);
			
			/*2. a�adir una nueva etiqueta Nombre1 en todos los tiposplatos*/
			System.out.println("\nSegunda parte \n");
			Iterator it2=elementos.iterator();
			while(it2.hasNext()){
				Element nombre1=new Element("nombre1");
				Element comida=(Element) it2.next();
				Element tipoplatos=comida.getChild("tipoplatos");
				tipoplatos.addContent(nombre1);
			}
			new XMLOutputter().output(doc,System.out);
			
			/*3. modificar el texto de las nuevas etiquetas nombre1
 horchata ,vino, cava respectivamente*/
			System.out.println("\nTercera parte\n");
			for(int i=0;i<3;i++){
				Element nombre1=elementos.get(i).getChild("tipoplatos").getChild("nombre1");
				switch(i){
				case 0:
					nombre1.setText("horchata");
					break;
				case 1:
					nombre1.setText("vino");
					break;
				case 2:
					nombre1.setText("cava");
					break;
				}
			}
			new XMLOutputter().output(doc,System.out);
			
			/*4. Eliminar del men� las comidas cuyo plato sea postre y 
			 * su nombre coincida con crema con nueces*/
			System.out.print("\nCuarta parte\n");
			Iterator it3=elementos.iterator();
			while(it3.hasNext()){
				Element comida=(Element)it3.next();
				if(comida.getAttributeValue("plato").equals("postre")){
					Element tipoplatos=comida.getChild("tipoplatos");
					List<Element> nombres=tipoplatos.getChildren("nombre");
					Iterator it4=nombres.iterator();
					while(it4.hasNext()){
						Element nombre=(Element)it4.next();
						if(nombre.getText().equals("crema con nueces")){
							tipoplatos.removeContent(nombre);
						}
					}
				}
			}
			new XMLOutputter().output(doc,System.out);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

package escribiryleer;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom2.*;
import org.jdom2.output.*;
public class Ejercicio1Escribir {

	public static void main(String[] args) {
		
		Element root=new Element("tebeos");
		//Personajes
		Element personajes=new Element("personajes");
		Element personaje=new Element("personaje");
		//Autores
		Element autores=new Element("autores");
		Element dibujantes=new Element("dibujantes");
		Element dibujante=new Element("dibujante");
		Element nombredib=new Element("nombredibujante");
		Element apodo=new Element("apodo");
		Element nacimientodib=new Element("nacimientoFecha");
		Element nacimientopaisdib=new Element("nacimientoPais");
		Element fallecimientodib=new Element("fallecimientoFecha");
		//Guionistas
		Element guionistas=new Element("guionistas");
		Element guionista=new Element("guionista");
		Element nombregui=new Element("nombre");
		Element nacimientogui=new Element("nacimientoFecha");
		Element nacimientopaisgui=new Element("nacimientoPais");
		Element fallecimientogui=new Element("fallecimientoFecha");
		
		//A�adimos a personajes todas las etiquetas
		
		personaje.setAttribute("id","P001");
		personaje.setAttribute("especie", "humano");
		personaje.setText("Asterix");
		personajes.addContent(personaje);
		
		personaje=new Element("personaje");
		
		personaje.setAttribute("id","P002");
		personaje.setAttribute("especie", "animal");
		personaje.setText("Idefix");
		personajes.addContent(personaje);
		
		personaje=new Element("personaje");
		
		personaje.setAttribute("id","P003");
		personaje.setAttribute("especie", "humano");
		personaje.setText("Lucky luke");
		personajes.addContent(personaje);
		
		personaje=new Element("personaje");
		
		personaje.setAttribute("id","P004");
		personaje.setAttribute("especie", "animal");
		personaje.setText("Spiderman");
		personajes.addContent(personaje);
		
		//A�adimos a autores todas las etiquetas(en orden ascendente)
		
		nombredib.setText("Albert Uderzo");
		nacimientodib.setText("1927");
		nacimientopaisdib.setText("Francia");
		
		dibujante.setAttribute("id","D001");
		dibujante.addContent(nombredib);
		dibujante.addContent(nacimientodib);
		dibujante.addContent(nacimientopaisdib);
		
		dibujantes.addContent(dibujante);
		
		dibujante=new Element("dibujante");
		nombredib=new Element("nombre");
		nacimientodib=new Element("nacimientoFecha");
		nacimientopaisdib=new Element("nacimientoPais");
		
		nombredib.setText("Maurice de Bevere");
		apodo.setText("Morris");
		nacimientodib.setText("1923");
		nacimientopaisdib.setText("Belgica");
		fallecimientodib.setText("2001");
		
		dibujante.setAttribute("id","D002");
		dibujante.addContent(nombredib);
		dibujante.addContent(apodo);
		dibujante.addContent(nacimientodib);
		dibujante.addContent(nacimientopaisdib);
		dibujante.addContent(fallecimientodib);
		
		dibujantes.addContent(dibujante);
		
		autores.addContent(dibujantes);
		
		//A�adimos a guionistas todas las etiquetas
		
		nombregui.setText("Rene Goscinny");
		nacimientogui.setText("1996");
		nacimientopaisgui.setText("Francia");
		fallecimientogui.setText("1997");
		
		guionista.setAttribute("id","G001");
		guionista.addContent(nombregui);
		guionista.addContent(nacimientogui);
		guionista.addContent(nacimientopaisgui);
		guionista.addContent(fallecimientogui);
		
		guionistas.addContent(guionista);
		
		autores.addContent(guionistas);
		
		//A�adimos las etiquetas creadas a autores y a tebeos
		
		root.addContent(personajes);
		root.addContent(autores);
		
		Document doc=new Document(root);
		try {
			new XMLOutputter().output(doc, new FileOutputStream("PracticaXML.xml"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}

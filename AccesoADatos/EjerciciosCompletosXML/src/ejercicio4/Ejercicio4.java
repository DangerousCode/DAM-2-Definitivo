package ejercicio4;
import org.jdom2.*;
import org.jdom2.output.XMLOutputter;
import java.io.*;
public class Ejercicio4 {

	public static void main(String[] args) throws IOException{
		Element root=new Element("cepal");
		Element profesores=new Element("profesores");
		root.addContent(profesores);
		Element nombre=new Element("nombre");
		nombre.setText("Marta");
		profesores.addContent(nombre);
		Element apellidos=new Element("apellidos");
		apellidos.setText("Ramirez");
		profesores.addContent(apellidos);
		Element edad=new Element("edad");
		edad.setText("40");
		profesores.addContent(edad);
		
		Document doc=new Document(root);
		new XMLOutputter().output(doc, new FileOutputStream("Ejercicio4.xml"));
	}

}

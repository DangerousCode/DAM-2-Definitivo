import org.jdom2.*;
import org.jdom2.output.XMLOutputter;
public class EjemploXML {
	public static void main(String[] args){
		Element root=new Element("ejemplo");
		Document doc=new Document(root);
		XMLOutputter salida=new XMLOutputter();
		root.setText("Prueba");
	}
}

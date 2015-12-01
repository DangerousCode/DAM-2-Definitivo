package ejercicio6;
import org.jdom2.*;
import org.jdom2.input.*;
import org.jdom2.output.XMLOutputter;
public class Ejercicio6 {

	public static void main(String[] args) {
		try{
			SAXBuilder builder=new SAXBuilder();
			Document doc=builder.build("Ejercicio6.xml");
			
			new XMLOutputter().output(doc, System.out);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

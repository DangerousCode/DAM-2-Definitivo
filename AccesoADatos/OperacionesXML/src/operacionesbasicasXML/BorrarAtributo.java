package operacionesbasicasXML;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;
import org.jdom2.input.*;
public class BorrarAtributo {
	public static void main(String[] args){
		try{
			SAXBuilder builder=new SAXBuilder();
			Document doc=builder.build("Operaciones.xml");
			Element root=doc.getRootElement();
			root.getChild("historieta").removeAttribute("precio");
			new XMLOutputter().output(doc,System.out);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

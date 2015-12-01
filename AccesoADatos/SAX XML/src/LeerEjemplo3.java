import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;

import org.jdom2.*;
import java.util.*;

public class LeerEjemplo3 {
	public static void main(String[] args){
		try{
			SAXBuilder builder=new SAXBuilder();
			Document doc=builder.build("xml.xml");
			Element root=doc.getRootElement();
			System.out.println(root.getAttribute("tipo"));
			
			List equipos=root.getChildren("equipo");
			Iterator it=equipos.iterator();
			while(it.hasNext()){
				Element e=(Element)it.next();
				System.out.print(e);
				System.out.print(e.getText()+"\n");
				Element club=e.getChild("club");
				Element presidente=e.getChild("presidente");
				List plantilla=e.getChildren("plantilla");
				Iterator it2=plantilla.iterator();
				while(it2.hasNext()){
					Element p=(Element)it2.next();
					List nombre=p.getChildren("nombre");
					Iterator it3=nombre.iterator();
					while(it3.hasNext()){
						Element n=(Element) it3.next();
						System.out.print(n);
						System.out.print(n.getText()+"\n");
					}
				}
				System.out.print(club);
				System.out.print(club.getText()+"\n");
				System.out.print(presidente);
				System.out.print(presidente.getText()+"\n");
				System.out.println(plantilla);
				
				if(e.getChildren("conextranjeros").size()==0){
					System.out.println("No hay");
				}
				else{
					System.out.println("<conextranjeros/");
				}
			}
			List arbitro=root.getChildren("arbitros");
			Iterator it4=arbitro.iterator();
			while(it4.hasNext()){
				Element arbitros=(Element)it4.next();
				List nombre1=arbitros.getChildren("nombre");
				Iterator it5=arbitro.iterator();
				while(it5.hasNext()){
					Element a=(Element) it5.next();
					System.out.print(a);
					System.out.print(a.getText()+"\n");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

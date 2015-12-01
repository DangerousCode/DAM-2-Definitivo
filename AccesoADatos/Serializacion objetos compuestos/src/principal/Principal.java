package principal;
import herramientas.Herramientas;
import java.io.*;
public class Principal {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Agenda agenda1=new Agenda(new Contacto("Alvaro","602158963"));
		Agenda agenda2=new Agenda(new Contacto("Alex","685489321"));
		Agenda agenda3=new Agenda(new Contacto("Alberto","692365478"));
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\AlumnoT\\Desktop\\SerializarObjetoCompuesto.obj"));

		Herramientas.serializarObject(agenda1, oos);
		Herramientas.serializarObject(agenda2, oos);
		Herramientas.serializarObject(agenda3, oos);
		
		oos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\AlumnoT\\Desktop\\SerializarObjetoCompuesto.obj"));
		Herramientas.leerObjetos(ois);
	}

}

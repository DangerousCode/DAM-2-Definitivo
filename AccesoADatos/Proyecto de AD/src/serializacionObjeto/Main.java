package serializacionObjeto;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Contacto contacto=new Contacto("Alvaro","607578954");
		herramientas.Herramientas.serializarObject(contacto, "C:\\Users\\AlumnoT\\Desktop\\fichero.obj");
		herramientas.Herramientas.desserializarObject("C:\\Users\\AlumnoT\\Desktop\\fichero.obj");
	}

}

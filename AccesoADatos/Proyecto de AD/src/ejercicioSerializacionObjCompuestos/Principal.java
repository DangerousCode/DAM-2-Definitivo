package ejercicioSerializacionObjCompuestos;
import java.io.*;

import herramientas.Herramientas;
public class Principal {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Proyecto proyecto=new Proyecto("Videojuego",new Empleados("Alvaro","Santos",19,"637322296"),new OObjetos(2015,"AnyoCreacion","Java","Eclipse"));
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\AlumnoT\\Desktop\\SerializarObjetoCompuesto.obj"));
		
		Herramientas.serializarObject(proyecto, oos);
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\AlumnoT\\Desktop\\SerializarObjetoCompuesto.obj"));
		
		Herramientas.leerObjetos(ois);
	}
}

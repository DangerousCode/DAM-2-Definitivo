package serializacionArray;
import java.io.*;
public class CreacionFicheroPrueba {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		int array[]=new int[3];
		array[0]=4;
		array[1]=12;
		array[2]=23;
		herramientas.Herramientas.serializarArray(array, "C:\\Users\\AlumnoT\\Desktop\\fichero.obj");
		herramientas.Herramientas.desserializarArray("C:\\Users\\AlumnoT\\Desktop\\fichero.obj");
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Collection;

public class Herramientas {
	/**
	 * 
	 * @param C
	 *            Coleccion que va a ser recorrida
	 */
	public static void recorrerColeccion(Collection C) {
		Iterator it = C.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	/**
	 * 
	 * @param map
	 *            HashMap que va a ser recorrido con datos String
	 */
	public static void recorrerStringMap(Map map) {
		Iterator it = map.keySet().iterator();

		while (it.hasNext()) {
			String clave = (String) it.next(); // Para integer hay que cambiar
												// el string por int
			Object valor = (Object) map.get(clave);
			System.out.println(clave + " " + valor);
		}
	}

	/**
	 * 
	 * @param map
	 *            HashMap que va a ser recorrido con datos Integer
	 */
	public static void recorrerIntegerMap(Map map) {
		Iterator it = map.keySet().iterator();

		while (it.hasNext()) {
			Integer clave = (Integer) it.next(); // Para integer hay que cambiar
													// el string por int
			Object valor = (Object) map.get(clave);
			System.out.println(clave + " " + valor);
		}
	}

	/**
	 * 
	 * @throws IOException
	 *             Excepcion para operaciones I/O
	 */
	// Escritura de fichero secuencial
	public static void escribirFichero() throws IOException {
		//Cambiar la ruta del fichero si se trabaja en otra maquina.
		BufferedWriter fe = new BufferedWriter(new FileWriter("C:\\Users\\Alumnot\\Desktop\\productos.txt"));

		for (int i = 1; i <= 3; i++) {
			fe.write("Hola " + i);
			fe.newLine();
		}
		fe.close();
	}

	/**
	 * 
	 * @throws IOException
	 */
	// Lectura de fichero secuencial
	public static void leerFichero() throws IOException {
		//Cambiar la ruta del fichero si se trabaja en otra maquina.
		BufferedReader fr = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Desktop\\productos.txt"));
		String aux;
		int cont = 0;

		while (fr.ready() && cont < 2) {
			aux = fr.readLine();
			System.out.println("Codigo Producto: " + aux);
			aux = fr.readLine();
			System.out.println("Nombre Producto: " + aux);
			aux = fr.readLine();
			System.out.println("Precio Producto: " + aux);
			cont++;
		}

		fr.close();
	}
	/**
	 * 
	 * @param txt Se le pasa una cadena de texto para
	 * @param largo Se le pasa la longitud en bytes que va a ocupar la cadena
	 * @return Devuelve la cadena de texto pasada
	 */
	public static String convertUTF(String txt, int largo) {
		if (txt.length() > largo)
			return txt.substring(0, largo);
		for (int n = txt.length(); n < largo; n++)
			txt = txt + " ";
		return txt;

	}
}
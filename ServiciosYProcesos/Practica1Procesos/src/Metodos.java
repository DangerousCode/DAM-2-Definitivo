import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
public class Metodos {
	public static void leerFicheros(String nombre)throws IOException{
		String lfichero="";
		BufferedReader lectura=new BufferedReader(new FileReader(nombre));
		while(lectura.ready()){
			lfichero=lectura.readLine();
			System.out.println(lfichero);
		}
		lectura.close();
	}
}

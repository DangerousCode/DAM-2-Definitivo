import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
public class Prueba {
	public static void main(String[] args)throws IOException{
		String lfichero="";
		BufferedReader lectura=new BufferedReader(new FileReader("C:\\Users\\Alvaro\\Desktop\\salidaUsuario1.txt"));
		while(lectura.ready()){
			lfichero=lectura.readLine();
			System.out.println(lfichero);
		}
		lectura.close();
	}
}

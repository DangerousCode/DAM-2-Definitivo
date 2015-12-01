package temaUno;
import java.io.*;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import herramientas.Herramientas;

public class Ejercicio6 {

	public static void main(String[] args) throws IOException{
		ArrayList<String> contenido=new ArrayList<String>();
		RandomAccessFile raf=new RandomAccessFile("C:\\Users\\Alvaro Santos\\Desktop\\info.txt","rw");
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		
		//Creamos un fichero y lo rellenamos con datos
		
		for(int i=0;i<3;i++){
			System.out.print("Introduce el dato: ");
			raf.writeUTF(Herramientas.convertUTF(sc.readLine(), 20));
		}
		
		raf.close();
		//Cerramos el fichero raf
		RandomAccessFile rafr=new RandomAccessFile("C:\\Users\\Alvaro Santos\\Desktop\\info.txt","r");
		//Abrimos en modo lectura
		for(int j=0;j<3;j++){
			rafr.seek(j*22);
			contenido.add(rafr.readUTF());
		}
		
		rafr.close();
		//Cerramos fichero rafr
		contenido.remove(0);
		//Eliminamos posicion
		RandomAccessFile rafw=new RandomAccessFile("C:\\Users\\Alvaro Santos\\Desktop\\info.txt","rw");
		rafw.seek(0);
		
		for(int k=0;k<contenido.size();k++){
			rafw.writeUTF(Herramientas.convertUTF(contenido.get(k), 20));
		}
		
		rafw.close();
	}

}

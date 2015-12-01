package temaUno;
import java.util.*;

import herramientas.Herramientas;

import java.io.*;
public class Ejercicio4 {
	public static void main(String[] args) throws IOException{
		
		ArrayList<String> al=new ArrayList<String>();
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<5;i++){
			System.out.print("Introduce el titulo: ");
			al.add(sc.readLine());
		}
		
		RandomAccessFile raf=new RandomAccessFile("C:\\Users\\AlumnoT\\Desktop\\biblioteca.txt", "rw");
		for(int j=0;j<al.size();j++){
			raf.writeUTF(Herramientas.convertUTF(al.get(j), 20));
		}
		raf.close();
		
		RandomAccessFile rafr=new RandomAccessFile("C:\\Users\\AlumnoT\\Desktop\\biblioteca.txt", "r");
		for(int k=0;k<al.size();k++){
			rafr.seek(k*22);
			System.out.println("\nTitulo: "+rafr.readUTF());
		}
		rafr.seek(0);
		System.out.println("\nPrimer titulo del fichero: "+rafr.readUTF());
		rafr.seek(4*22);
		System.out.println("Ultimo titulo del fichero: "+rafr.readUTF());
		
		rafr.close();
	}
}

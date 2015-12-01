package temaUno;
import java.util.*;

import herramientas.Herramientas;

import java.io.*;
public class Ejercicio5 {

	public static void main(String[] args) throws IOException{
		HashMap<Integer,String> al=new HashMap<Integer,String>();
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<5;i++){
			System.out.print("Introduce el titulo: ");
			al.put(1,sc.readLine());
		}
		
		RandomAccessFile raf=new RandomAccessFile("C:\\Users\\asant\\Desktop\\biblioteca.txt", "rw");
		for(int j=0;j<al.size();j++){
			raf.writeUTF(Herramientas.convertUTF(al.get(j), 20));
		}
		raf.close();
		
		RandomAccessFile rafr=new RandomAccessFile("C:\\Users\\asant\\Desktop\\biblioteca.txt", "r");
		for(int k=0;k<al.size();k++){
			rafr.seek(k*22);
			System.out.println("\nTitulo: "+rafr.readUTF());
		}
		rafr.close();
	}

}

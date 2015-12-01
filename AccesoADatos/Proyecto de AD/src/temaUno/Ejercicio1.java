package temaUno;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Iterator;
public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		ArrayList <Integer> al=new ArrayList <Integer>();
		int numero;
		int suma=0;
		BufferedReader fw=new BufferedReader(new FileReader("C:\\Users\\AlumnoT\\Desktop\\numero.txt"));
		
		while(fw.ready()){
			 numero=Integer.parseInt(fw.readLine());
			 al.add(numero);
		}
		
		
		for(int j=0; j<al.size();j++){
			suma=suma+al.get(j);
		}
		
		System.out.println("La suma es: "+suma);
	}

}

package temaUno;
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Ejercicio2 {
	public static void main(String[] args) throws IOException{
		ArrayList <Integer> al=new ArrayList <Integer>();
		int numero;
		int suma=0;
		BufferedReader fw=new BufferedReader(new FileReader("C:\\Users\\AlumnoT\\Desktop\\numero.txt"));
		System.out.println("Pares e impares del fichero: \n");
		while(fw.ready()){
			 numero=Integer.parseInt(fw.readLine());
			 if(numero%2==0){
				 System.out.println("Par");
			 }
			 else{
				 System.out.println("Impar");
			 }
			 al.add(numero);
		}
		
		System.out.println("\n\nPares e impares del ArrayList: \n");
		
		for(int j=0; j<al.size();j++){
			numero=al.get(j);
			if(numero%2==0){
				 System.out.println("Par");
			 }
			 else{
				 System.out.println("Impar");
			 }
		}
	}
}


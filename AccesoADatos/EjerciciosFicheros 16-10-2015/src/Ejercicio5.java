/*
 * Crear un programa que :
Si tenemos una Colección con los siguientes datos  {0,3,-4,2,-1}  
 , queremos que esos datos se guarden en un fichero . Vamos a leer los datos del fichero y  
 a la vez que lo leemos vamos a ordenar los datos obtenidos ya que al final 
 los guardaremos en otra Colección  que quedará ordenado como sigue: {-4,3,2,-1,0}.

 */
import java.util.*;
import java.io.*;
public class Ejercicio5 {
	public static void main(String args[]) throws IOException{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(0);
		al.add(3);
		al.add(-4);
		al.add(2);
		al.add(-1);
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("ejercicio5.txt"));
		
		for(int i=0;i<5;i++){
			bw.write(al.get(i));
		}
		bw.close();
		
		BufferedReader br=new BufferedReader(new FileReader("ejercicio5.txt"));
		ArrayList<Integer> alfichero=new ArrayList<Integer>();
		
		while(br.ready()){
			
		}
	}
}

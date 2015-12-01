package ejercicio2;
import java.io.*;
import java.util.*;
public class Ejercicio2 {
	public static void main(String[] args){
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter("hola.txt"));
			BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br=new BufferedReader(new FileReader("hola.txt"));
			
			System.out.print("Introduce la frase: ");
			String cadena=sc.readLine();
			
			bw.write(cadena);
			bw.close();
			
			String linea;
			while((linea=br.readLine())!=null){
				StringTokenizer tokenizer=new StringTokenizer(linea," ");
				while(tokenizer.hasMoreTokens()){
					String cad=tokenizer.nextToken();
					System.out.print(cad);
				}
			}
		}catch(IOException e){
			System.out.println("Excepcion io");
		}
	}
}

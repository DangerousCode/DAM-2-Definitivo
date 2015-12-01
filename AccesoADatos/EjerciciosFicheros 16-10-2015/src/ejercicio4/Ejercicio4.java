/*
 * 1. Volcado de un arraylist con los 100 primeros números pares a un fichero de texto. El nombre del

fichero lo elegirá el usuario ( lo deberá escribir él)

2. Mostrar por pantalla el número que se encuentra en la posición 3 del fichero.

3. Salir del Programa.
 */
package ejercicio4;
import java.util.*;
import java.io.*;
public class Ejercicio4 {

	public static void main(String[] args) throws IOException{
		ArrayList<Integer> alcomp=new ArrayList<Integer>();
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduzca el nombre del fichero: ");
		String ruta=sc.readLine();
		RandomAccessFile raf= new RandomAccessFile(ruta+".txt","rw");
		boolean flag=false;
		do{
			System.out.println("Introduce la opcion: ");
			int opcion=Integer.parseInt(sc.readLine());
			switch(opcion){
			case 1:
				alcomp=Metodos.llenarArrayList();
				Metodos.escribirArrayList(alcomp, raf);
				break;
			case 2:
				Metodos.leerTerceraPosicion(raf);
				break;
				
			case 3:
				System.out.println("Fin del programa.");
				flag=true;
				break;
			}
		}while(!flag);
	}

}

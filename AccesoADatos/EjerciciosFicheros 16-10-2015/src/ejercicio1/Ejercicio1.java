package ejercicio1;
import java.io.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		try{
			RandomAccessFile entrada; 
			entrada=new RandomAccessFile("fichero","r");
			//Linea que falta:
			entrada.seek(10);
			int dato=entrada.readInt();
			int real=entrada.readInt();
		}catch(IOException e){
			System.out.println("Excepcion io");
		}
	}

}

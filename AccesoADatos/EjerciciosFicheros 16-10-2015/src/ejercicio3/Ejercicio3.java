package ejercicio3;
import java.io.*;
public class Ejercicio3 {
	public static void main(String[] args){
		try{
			RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");
			int num=6;
			int num2=9;
			double real=900.6;
			
			raf.writeInt(num);
			raf.writeInt(num2);
			raf.writeDouble(real);
			
			raf.seek(0);
			System.out.print
		}catch(IOException e){
			System.out.println("Excepcion io");
		}
	}
}

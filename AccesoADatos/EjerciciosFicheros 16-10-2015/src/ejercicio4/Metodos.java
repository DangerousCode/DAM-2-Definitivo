package ejercicio4;
import java.io.*;
import java.util.*;
public class Metodos implements Serializable {
	public static ArrayList<Integer> llenarArrayList(){
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i=1;i<101;i++){
			al.add(i);
		}
		return al;
	}
	
	public static void escribirArrayList(ArrayList<Integer> alcomp, RandomAccessFile raf) throws IOException{
    	for(int i=0;i<100;i++){
    		raf.writeInt(alcomp.get(i));
    	}
	}
	
	public static void leerTerceraPosicion(RandomAccessFile raf) throws IOException{
		raf.seek(2*4);
		System.out.println("El dato de la tercera posicion es: "+raf.readInt());
	}
}

package creador;
import java.util.*;
import java.util.concurrent.*;
public class Cinta{
	public static Paquete paquetes[];
	public static Semaphore sempaq;

	public static void BorrarPaquete(int pos){
		//Borra la posicion del array.
		paquetes[pos]=null;
		sempaq.release();
	}
	public static void AniadirPaquete(Paquete paquete){
		//Recorre el array para ver si hay algun null. Si lo hay añade una paquete
		for(int i=0;i<paquetes.length;i++){
			if(paquetes[i]==null){
				paquetes[i]=paquete;
			}
		}
	}
}

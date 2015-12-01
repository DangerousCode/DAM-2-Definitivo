package creador;

import java.util.*;
import java.util.concurrent.*;

public class Cinta {

    public static Paquete paquetes[] = new Paquete[20];
    public static Semaphore sempaq[] = new Semaphore[paquetes.length];
    public static Semaphore semcinta = new Semaphore(2);
    public static boolean fin = false;

    //Clase para inicializar la cinta
    public static void InicializarPaquetes() {
        for (int i = 0; i < paquetes.length; i++) {
            paquetes[i] = null;
            sempaq[i] = new Semaphore(1);
        }
    }

    //Borra un paquete y sube el semaforo de esa posicion
    public static void BorrarPaquete(int pos) throws Exception {
        //Borra la posicion del array.
        paquetes[pos] = null;
        sempaq[pos].release();
    }

    //Añade un paquete

    public static void AniadirPaquete(Paquete paquete, int i) {
        //Recorre el array para ver si hay algun null. Si lo hay a�ade una paquete
        paquetes[i] = paquete;
    }
}

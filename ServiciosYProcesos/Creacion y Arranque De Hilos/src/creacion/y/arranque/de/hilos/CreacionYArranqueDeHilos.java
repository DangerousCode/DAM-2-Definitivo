/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacion.y.arranque.de.hilos;

/**
 *
 * @author Alumnot
 */

class HelloThread extends Thread{
    public void run(){
        System.out.println("Hola desde el hilo creado");
    }
}
public class CreacionYArranqueDeHilos{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new HelloThread().start();
        System.out.println("Hola desde el hilo principal");
        System.out.println("Proceso acabando");
    }
    
}

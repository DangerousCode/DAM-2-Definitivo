/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.monitores;

/**
 *
 * @author AlumnoT
 */
public class Syncro {
    Syncro()
    {
        
    }
    
    public synchronized void comprar(int numero, String producto) throws InterruptedException{
        wait();
        System.out.println("Soy la persona "+numero+" y he comprado "+producto);
    }
    
    public synchronized void despertar(){
        notify();
    }
}

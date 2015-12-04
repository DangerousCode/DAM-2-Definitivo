/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.monitores;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alvaro
 */
class Persona extends Thread{
    
    int numero;
    String producto;
    Syncro sync;
    
    public Persona(int numero, String producto, Syncro sync) {
        this.numero = numero;
        this.producto = producto;
        this.sync=sync;
    }

    public int getNumero() {
        return numero;
    }

    public String getProducto() {
        return producto;
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(500);
            sync.comprar(numero, producto);
        } catch (InterruptedException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    

}

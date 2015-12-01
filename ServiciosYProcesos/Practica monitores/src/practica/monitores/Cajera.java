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
 * @author AlumnoT
 */
public class Cajera extends Thread {
    int id;
    Persona cola[];
    Cajera(int id, Persona cola[]) {
        this.id = id;
        this.cola=cola;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public void run(){
        boolean finjornada=false;
        while(!finjornada){
                System.out.println("La persona "+cola[0].getNumero()+" ha comprado un "+cola[0].getProducto()+" en la caja "+id);
                cola[0]=null;
                
        }
    }
    
}

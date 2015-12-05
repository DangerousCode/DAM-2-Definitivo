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
    boolean ocupada = false;
    Syncro sync;

    Cajera(int id, Persona cola[], Syncro sync) {
        this.id = id;
        this.cola = cola;
        this.sync=sync;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOcupada(boolean esperar) {
        this.ocupada = esperar;
    }

    @Override
    public void run() {
        int persona=0;
        while (persona!=cola.length-1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cajera.class.getName()).log(Level.SEVERE, null, ex);
            }
            sync.despertar();
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.monitores;

import java.text.DecimalFormat;
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
    boolean finjornada = false;

    public void setFinjornada(boolean finjornada) {
        this.finjornada = finjornada;
    }
    Syncro sync;
    double recaudacion;
    Ventanas ventanas[];

    Cajera(int id, Persona cola[], Syncro sync, Ventanas ventanas[]) {
        this.id = id;
        this.cola = cola;
        this.sync = sync;
        this.ventanas = ventanas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOcupada(boolean esperar) {
        this.ocupada = esperar;
    }

    public void sumRecaudacion(double valor) {
        recaudacion += valor;
    }

    @Override
    public void run() {
        DecimalFormat dc=new DecimalFormat("0.00");
        int persona = 0;
        while (!finjornada) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cajera.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(!ocupada){
                sync.despertar();
            }
        }
        ventanas[id-1].escribecadena("La recaudacion de esta caja es: " + dc.format(recaudacion) + " euros");
    }

}

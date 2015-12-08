/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.monitores;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alvaro
 */
class Persona extends Thread {

    int numero;
    String producto;
    double precio;
    Syncro sync;
    Cajera cajera[];
    Ventanas ventanas[];

    public Persona(int numero, String producto, Syncro sync, Cajera cajera[], Ventanas ventanas[], double precio) {
        this.numero = numero;
        this.producto = producto;
        this.sync = sync;
        this.cajera = cajera;
        this.ventanas=ventanas;
        this.precio=precio;
    }

    public int getNumero() {
        return numero;
    }

    public String getProducto() {
        return producto;
    }

    @Override
    public void run() {
        int caja;
        try {
            Thread.sleep(500);
            caja = sync.comprar(numero, producto, cajera, ventanas, precio);
            Random rand = new Random();
            switch (rand.nextInt(3)) {
                case 0:
                    Thread.sleep(3000);
                    cajera[caja].setOcupada(false);
                case 1:
                    Thread.sleep(1500);
                    cajera[caja].setOcupada(false);
                case 2:
                    Thread.sleep(500);
                    cajera[caja].setOcupada(false);

            }
            Principal.cuentapersonas++;
        } catch (InterruptedException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

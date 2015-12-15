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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static final int LONGCOLA = 20;
    public static int cuentapersonas = 0;

    public static void main(String[] args) {
        Syncro sync = new Syncro();
        Persona cola[] = new Persona[LONGCOLA];
        Cajera cajera[] = new Cajera[3];
        Ventanas ventanas[] = {new Ventanas("Caja 1"), new Ventanas("Caja 2"), new Ventanas("Caja 3")};
        for (int i = 0; i < cajera.length; i++) {
            cajera[i] = new Cajera(i + 1, cola, sync, ventanas);
            cajera[i].start();
        }
        int personas = 0;
        //Inicializa el array de personas
        for (int i = 0; i < cola.length; i++) {
            Random rand = new Random();
            switch (rand.nextInt(3)) {
                case 0:
                    cola[i] = new Persona(personas, "Champu", sync, cajera, ventanas, 3.50);
                    break;
                case 1:
                    cola[i] = new Persona(personas, "Televisor", sync, cajera, ventanas, 559.99);
                    break;
                case 2:
                    cola[i] = new Persona(personas, "Consola", sync, cajera, ventanas, 399.99);
                    break;
            }
            personas++;
        }
        for (int i = 0; i < cola.length; i++) {
            cola[i].start();
        }
        //Join de los hilos
        for (int i = 0; i < cola.length; i++) {
            try {
                cola[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for (int i = 0; i < cajera.length; i++) {
            try {
                cajera[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

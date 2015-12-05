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
    public static void main(String[] args) {
        Syncro sync = new Syncro();
        Persona cola[] = new Persona[80];
        Cajera cajera[] = new Cajera[3];
        Ventanas ventanas[]={new Ventanas("Cajera 1"),new Ventanas("Cajera 2"),new Ventanas("Cajera 3")};
        for (int i = 0; i < cajera.length; i++) {
            cajera[i] = new Cajera(i + 1, cola, sync);
            cajera[i].start();
        }
        int personas = 0;
        //Inicializa el array de personas
        for (int i = 0; i < cola.length; i++) {
            Random rand = new Random();
            switch (rand.nextInt(3)) {
                case 0:
                    cola[i] = new Persona(personas, "Champu", sync, cajera, ventanas);
                    break;
                case 1:
                    cola[i] = new Persona(personas, "Televisor", sync, cajera, ventanas);
                    break;
                case 2:
                    cola[i] = new Persona(personas, "Consola", sync, cajera, ventanas);
                    break;
            }
            personas++;
        }
        for (int i = 0; i < cola.length; i++) {
            cola[i].start();
        }
        //Join de los hilos
        for (int i = 0; i < cajera.length; i++) {
            try {
                cajera[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 0; i < cola.length; i++) {
            try {
                cola[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

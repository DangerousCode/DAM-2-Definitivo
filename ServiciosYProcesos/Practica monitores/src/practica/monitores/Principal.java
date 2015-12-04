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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static Syncro sync=new Syncro();
    public static Persona cola[] = new Persona[80];

    public static void main(String[] args) {

        try {
            Dios dios = new Dios(cola, sync);
            dios.start();
            Thread.sleep(4000);
            Cajera cajera[] = new Cajera[3];
            for (int i = 0; i < cajera.length; i++) {
                cajera[i] = new Cajera(i + 1, cola, sync);
                cajera[i].start();
            }
            //Join de los hilos
            dios.join();
            for (int i = 0; i < cola.length; i++) {
                cajera[i].join();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

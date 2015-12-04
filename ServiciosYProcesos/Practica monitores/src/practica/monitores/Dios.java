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
public class Dios extends Thread {

    Persona cola[];
    Syncro sync;
    Dios(Persona cola[], Syncro sync) {
        this.cola = cola;
        this.sync=sync;
    }

    @Override
    public void run() {
        boolean finaljornada = false;
        int personas = 0;
        //Inicializa el array de personas
        for (int i=0;i<cola.length;i++){
          Random rand = new Random();
          switch (rand.nextInt(3)) {
                    case 0:
                        cola[i] = new Persona(personas, "Champu",sync);
                        break;
                    case 1:
                        cola[i] = new Persona(personas, "Televisor", sync);
                        break;
                    case 2:
                        cola[i] = new Persona(personas, "Consola", sync);
                        break;
                }
          personas++;
        }
        for (int i=0;i<cola.length;i++){
            cola[i].start();
        }
    }
}

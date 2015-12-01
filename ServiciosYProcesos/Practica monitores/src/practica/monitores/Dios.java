/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.monitores;

import java.util.Random;

/**
 *
 * @author Alvaro
 */
public class Dios extends Thread {

    Persona cola[];

    Dios(Persona cola[]) {
        this.cola = cola;
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
                        cola[i] = new Persona(personas, "Champu");
                        break;
                    case 1:
                        cola[i] = new Persona(personas, "Televisor");
                        break;
                    case 2:
                        cola[i] = new Persona(personas, "Consola");
                        break;
                }
          personas++;
        }
        while (!finaljornada) {
            //cola[0] sera null si la persona ha pasado por caja.
            if (cola[0] == null) {
                for (int i = cola.length - 1; i >= 0; i++) {
                    if(i==0){
                        break;
                    }
                    cola[i - 1] = cola[i];
                }

                cola[cola.length - 1] = null;

                Random rand = new Random();

                switch (rand.nextInt(3)) {
                    case 0:
                        cola[cola.length - 1] = new Persona(personas, "Champu");
                    case 1:
                        cola[cola.length - 1] = new Persona(personas, "Televisor");
                    case 2:
                        cola[cola.length - 1] = new Persona(personas, "Consola");
                }
            }
            personas++;
        }
    }
}

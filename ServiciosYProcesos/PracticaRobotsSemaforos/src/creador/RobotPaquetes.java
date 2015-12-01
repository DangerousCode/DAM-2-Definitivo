package creador;

import java.util.*;

public class RobotPaquetes extends Thread {

    public static int idpaq = 0;

    RobotPaquetes() {

    }

    @Override
    public void run() {
        //Se crean dos random para el peso y la direccion.
        Random randdireccion = new Random();
        Random randpeso = new Random();
        //Bucle para la ejecucion de este robot hasta que no haya mas paquetes
        while (idpaq != Creador.TOTALPAQUETES) {
            for (int i = 0; i < Cinta.paquetes.length; i++) {
                //Añade un paquete a la posicion que contenga un null
                if (Cinta.paquetes[i] == null) {
                    //Se generan numeros aleatorios para identificar cada paquete
                    switch (randdireccion.nextInt(4)) {
                        case 1:
                            Paquete paqueteL = new Paquete(idpaq, "L", randpeso.nextInt(100));
                            Cinta.AniadirPaquete(paqueteL, i);
                            idpaq++;
                            break;
                        case 2:
                            Paquete paqueteN = new Paquete(idpaq, "N", randpeso.nextInt(100));
                            Cinta.AniadirPaquete(paqueteN, i);
                            idpaq++;
                            break;
                        case 3:
                            Paquete paqueteI = new Paquete(idpaq, "I", randpeso.nextInt(100));
                            Cinta.AniadirPaquete(paqueteI, i);
                            idpaq++;
                            break;
                    }
                }
            }
        }

    }
}

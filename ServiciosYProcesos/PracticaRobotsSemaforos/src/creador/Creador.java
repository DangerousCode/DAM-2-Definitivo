package creador;

import java.util.concurrent.*;

public class Creador {

    //Cantidad de paquetes a repartir

    public static int TOTALPAQUETES = 1000;

    public static void main(String args[]) throws Exception {
        //Generamos un array de seis robots
        Robots[] robots = new Robots[6];
        //Generamos un robot que crea paquetes
        RobotPaquetes robotpaq = new RobotPaquetes();

        //Inicializamos los robots
        robots[0] = new Robots("L", 1);
        robots[1] = new Robots("L", 2);
        robots[2] = new Robots("N", 3);
        robots[3] = new Robots("N", 4);
        robots[4] = new Robots("I", 5);
        robots[5] = new Robots("I", 6);

        //Inicializamos la cinta
        Cinta.InicializarPaquetes();
        System.out.println("Inicializando cinta.");

        //Iniciamos el robot que crea paquetes.
        robotpaq.start();
        System.out.println("Creando paquetes.");

        //Lanzamos los robots
        for (int i = 0; i < 6; i++) {
            robots[i].start();
        }

        for (int i = 0; i < 6; i++) {
            robots[i].join();
        }

        robotpaq.join();
    }

}

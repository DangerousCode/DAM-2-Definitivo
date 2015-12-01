package creador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Robots extends Thread {

    String direccion;
    int id;
    int pesorecogido = 0;
    Ventanas ventana = new Ventanas("Robot " + this.id);

    Robots(String direccion, int id) {
        this.direccion = direccion;
        this.id = id;
    }

    @Override
    public void run() {

        int idpaq;
        int cont = 0;
        int contcinta = 0;
        boolean salir = false;

        ventana.escribecadena("\n\t\tSOY EL ROBOT " + id + "\n\tCOMENZANDO EJECUCION.\n\n");
        while (!salir) {
            try {
                Thread.sleep(250);
                idpaq = 0;
                Cinta.semcinta.acquire();
                for (int i = 0; i < Cinta.paquetes.length; i++) {
                    //Recorre el array y coge el paquete cuyo destino coincida con el del robot, no sea nulo y que no este siendo utilizado por otro robot.
                    if (Cinta.paquetes[i] != null && Cinta.paquetes[i].getDireccion().equals(direccion) && Cinta.sempaq[i].availablePermits() == 1) {
                        Cinta.sempaq[i].acquire();
                        //Acumulador del peso
                        pesorecogido += Cinta.paquetes[i].getPeso();
                        //Obtiene la id del paquete
                        idpaq = Cinta.paquetes[i].getId();
                        switch (direccion) {
                            case "L":
                                ventana.escribecadena("\nPaquete numero " + idpaq + " enviado con destino: Local\n");
                                Cinta.BorrarPaquete(i);
                                cont++;
                                break;
                            case "N":
                                ventana.escribecadena("\nPaquete numero " + idpaq + " enviado con destino: Nacional\n");
                                Cinta.BorrarPaquete(i);
                                cont++;
                                break;
                            case "I":
                                ventana.escribecadena("\nPaquete numero " + idpaq + " enviado con destino: Internacional\n");
                                Cinta.BorrarPaquete(i);
                                cont++;
                                break;
                        }
                    }
                }
                Cinta.semcinta.release();
                contcinta = 0;
                for (int i = 0; i < Cinta.paquetes.length; i++) {
                    if (Cinta.paquetes[i] == null) {
                        contcinta++;
                    }
                }
                if (contcinta == Cinta.paquetes.length) {
                    salir = true;
                }
            } catch (Exception ex) {
                Logger.getLogger(Robots.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ventana.escribecadena("\n\nLA CANTIDAD DE PAQUETES RECOGIDOS POR ESTE ROBOT ES: " + cont + "\n\nEL PESO RECOGIDO POR ESTE ROBOT ES DE: " + pesorecogido + " kilos\n\n\tFIN DE LA EJECUCION DEL ROBOT " + id);
    }
}

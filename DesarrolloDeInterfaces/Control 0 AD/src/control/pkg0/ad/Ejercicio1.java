/*
Programa para que construya un ArrayList de e-mails a partir 
de una cadena almacenada en el ﬁchero que debemos  leer. El 
fichero lo llamaremos correos.txt

Acciones:

		Guardar los datos en el ArrayList
		Mostrar los datos guardados en el ArrayList

*/
package control.pkg0.ad;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlumnoT
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ArrayList<String> al=new ArrayList<String>();
            al=Metodos.leerFicheroToken("correos.txt");
            for(int i=0;i<al.size();i++){
                System.out.println(al.get(i));
            }
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

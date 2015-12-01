/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpath.sin.abreviar;

/**
 *
 * @author AlumnoT
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //herramientas.Herramientas.consultasXPATH("libro.xml", "/child::libro/child::precio[self::precio='3.50'/parent::libro/child::titulo");
        herramientas.Herramientas.consultasXPATH("libro.xml", "/child::libro/child::precio");
    }
    
}

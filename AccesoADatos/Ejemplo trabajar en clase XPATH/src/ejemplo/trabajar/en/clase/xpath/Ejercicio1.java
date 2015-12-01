/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.trabajar.en.clase.xpath;

/**
 *
 * @author AlumnoT
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        herramientas.Herramientas.consultasXPATH("xml1.xml", "//capitulo[@num='2']/*");
        System.out.println("\n");
        
        herramientas.Herramientas.consultasXPATH("xml1.xml", "//capitulo[last()]/*");
        System.out.println("\n");
        
        herramientas.Herramientas.consultasXPATH("xml1.xml", "/libro/capitulo[not(last())]");
        System.out.println("\n");
        
        herramientas.Herramientas.consultasXPATH("xml1.xml", "//parrafo");
    }
    
}

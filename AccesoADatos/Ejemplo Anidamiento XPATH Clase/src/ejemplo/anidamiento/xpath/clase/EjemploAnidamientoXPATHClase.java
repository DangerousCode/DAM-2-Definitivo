/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.anidamiento.xpath.clase;

/**
 *
 * @author AlumnoT
 */
public class EjemploAnidamientoXPATHClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        herramientas.Herramientas.consultasXPATH("anid.xml", "//pelicula[fecha=//pelicula[titulo='Asesinato en el Orient Express']/fecha]/titulo");
        System.out.println("\n");
        herramientas.Herramientas.consultasXPATH("anid.xml", "//persona/fechas[@nacimiento<//persona[nombre='Janet Leigh']/fechas/@nacimiento]/../nombre");
        
        System.out.println("\nEjercicio 4\n\n");
        herramientas.Herramientas.consultasXPATH("anid.xml", "//pelicula[director=//persona/fechas[@nacimiento='1899' and @fallecimiento='1980']/../nombre]/titulo");
        System.out.println("\nEjercicio 5\n\n");
        herramientas.Herramientas.consultasXPATH("anid.xml", "//persona[@sexo=//persona[nombre='Lauren Bacall']/@sexo]/nombre");
        System.out.println("\nEjercicio 6\n\n");
        herramientas.Herramientas.consultasXPATH("anid.xml", "//persona/fechas[@fallecimiento>//persona[nombre='Anthony Perkins']/fechas/@fallecimiento]/../nombre");
    }
    
}

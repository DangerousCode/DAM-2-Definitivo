/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2.xpath.aula;
/**
 *
 * @author AlumnoT
 */
public class Ejercicio2XpathAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ej="ejercicio2.xml";
        //Parte uno
        herramientas.Herramientas.consultasXPATH(ej, "/ies/web");
        System.out.println("\nParte 2\n");
        herramientas.Herramientas.consultasXPATH(ej, "//ciclo/nombre");
        System.out.println("\nParte 3\n");
        herramientas.Herramientas.consultasXPATHAtributos(ej, "//ciclo[@id]","id");
        System.out.println("\nParte 4\n");
        herramientas.Herramientas.consultasXPATHAtributos(ej, "//decretoTitulo[@ano]","ano");
        System.out.println("\nParte 5\n");
        herramientas.Herramientas.consultasXPATH(ej, "//grado[.='Medio']/../*");
        System.out.println("\nParte 6\n");
        herramientas.Herramientas.consultasXPATH(ej, "//grado[.='Superior']/../nombre");
        System.out.println("\nParte 7\n");
        herramientas.Herramientas.consultasXPATH(ej, "//decretoTitulo[@ano<2010]/../nombre");
        System.out.println("\nParte 8\n");
        herramientas.Herramientas.consultasXPATH(ej, "//decretoTitulo[@ano=2008 or @ano=2010]/../nombre");
    }
    
}

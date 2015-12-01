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
public class Ejercicio3 {
    public static void main(String[] args){
        String ej="ejercicio3.xml";
        System.out.println("\nEJERCICIO 3 SIN ABREVIAR\n");
        herramientas.Herramientas.consultasXPATH(ej, "/child::ies/child::modulos/child::modulo/child::nombre");
        System.out.println("\nEjercicio2\n");
        herramientas.Herramientas.consultasXPATH(ej, "/child::ies/child::modulos/child::modulo/child::ciclo[self::ciclo='ASIR']/parent::modulo/child::nombre");
        System.out.println("\nEjercicio3\n");
        herramientas.Herramientas.consultasXPATH(ej, "//ancestor::horasSemanales[self::horasSemanales<'5']/parent::modulo/child::nombre");
        System.out.println("\nEjercicio4\n");
        herramientas.Herramientas.consultasXPATH(ej, "//child::modulo[child::ciclo='ASIR' and child::curso='1']/child::nombre");
        System.out.println("\nEjercicio5\n");
        herramientas.Herramientas.consultasXPATH(ej, "//ancestor::modulo[child::horasSemanales>'3']/child::horasSemanales");
        System.out.println("\n\n---------------EJERCICIO 3 ABREVIADO---------------\n");
        herramientas.Herramientas.consultasXPATH(ej, "/ies/modulos/modulo/nombre");
        System.out.println("\nEjercicio2\n");
        herramientas.Herramientas.consultasXPATH(ej, "//modulo[ciclo='ASIR']/nombre");
        System.out.println("\nEjercicio3\n");
        herramientas.Herramientas.consultasXPATH(ej, "//modulo[horasSemanales<'5']/nombre");
        System.out.println("\nEjercicio4\n");
        herramientas.Herramientas.consultasXPATH(ej, "//modulo[curso='1' and ciclo='ASIR']/nombre");
        System.out.println("\nEjercicio5\n");
        herramientas.Herramientas.consultasXPATH(ej, "//modulo[horasSemanales>'3']/horasSemanales");
    }
}

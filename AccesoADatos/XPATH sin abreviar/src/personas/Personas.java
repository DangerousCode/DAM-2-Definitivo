/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author AlumnoT
 */
public class Personas {
    public static void main(String[] args){
        herramientas.Herramientas.consultasXPATH("personas.xml", "/child::personas/descendant::nombre");
        System.out.println("\n");
        herramientas.Herramientas.consultasXPATH("personas.xml", "/child::personas/child::persona/descendant::edad");
    }
}

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
public class Ejercicio3 {
    public static void main(String[] args){
        herramientas.Herramientas.consultasXPATH("xml3.xml", "//Nombre");
        System.out.println("Parte 2\n");
        herramientas.Herramientas.consultasXPATH("xml3.xml", "//Factura[3]/Cliente/Direccion");
    }
}

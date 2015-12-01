/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author AlumnoT
 */
public class Ejercicio6 {
    public static void main(String args[]){
        herramientas.Herramientas.consultasXPATH("xml.xml", "/Empresa/departamento[position()=last()]/empleado/rut");
    }
}

//Seleccionar todos los nombres de los empleados
package ejercicios;

import herramientas.Herramientas;

public class Ejercicio1 {

	public static void main(String[] args) {
		Herramientas.consultasXPATH("xml.xml", "/Empresa/departamento/empleado/nombre");

	}

}

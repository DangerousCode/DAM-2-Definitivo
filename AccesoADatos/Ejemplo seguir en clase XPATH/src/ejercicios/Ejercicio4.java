package ejercicios;

import herramientas.Herramientas;

public class Ejercicio4 {

	public static void main(String[] args) {
		Herramientas.consultasXPATH("xml.xml", "//empleado[@salario>'50000'");
	}

}

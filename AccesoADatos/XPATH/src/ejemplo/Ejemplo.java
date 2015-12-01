package ejemplo;

import herramientas.Herramientas;

public class Ejemplo {
	public static void main(String args[]){
		String ruta="EjemploXpath.xml";
		
		Herramientas.consultasXPATH("EjemploXpath.xml", "//aula/nombrea[.='Aula1'/../../cred");
	}
}

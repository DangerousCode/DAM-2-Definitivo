package temaCero;
import java.util.*;

import herramientas.Herramientas;
public class Ejercicio2 {
	public static void main(String[] args){
		Persona pers=new Persona("02551304-Y", "Alvaro Santos");
		ArrayList<Object> col=new ArrayList<Object>();
		
		Herramientas.buscarDuplicados(pers, col);
	}
}

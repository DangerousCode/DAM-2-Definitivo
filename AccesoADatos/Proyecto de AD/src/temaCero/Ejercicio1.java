package temaCero;
import java.util.*;

import herramientas.Herramientas;
public class Ejercicio1 {
	public static void main(String[] args){
		Persona pers=new Persona("02551304-Y","Alvaro Santos");
		ArrayList<Object> lista=new ArrayList();
		lista.add(pers);
		Herramientas.recorrerColeccion(lista);
	}
}

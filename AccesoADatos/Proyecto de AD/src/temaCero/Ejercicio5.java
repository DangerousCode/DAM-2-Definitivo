package temaCero;
import java.util.*;

import herramientas.Herramientas;
public class Ejercicio5 {
	public static void main(String[] args){
		Animal pollo=new Animal("Pollo");
		Animal gato=new Animal("Gato");
		Animal cebra=new Animal("Cebra");
		
		HashMap<Integer,String> colanimales=new HashMap<Integer,String>();
		
		colanimales.put(1, pollo.nombre);
		colanimales.put(2, gato.nombre);
		colanimales.put(3, cebra.nombre);
		
		Herramientas.recorrerMapInteger(colanimales);
	}
}

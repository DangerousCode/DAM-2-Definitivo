/*3 Strings: Francia, Italia, España
Declarar un hashset y guardar datos.
Recorrer colección
Añadir Italia
RecocrrerColeccion*/

package Ejercicios;
import java.util.*;
import herramientas.Herramientas;
public class ejemploHashset {
	public static void main(String[] args){	
		Set <String> paises2=new HashSet<String>();
		paises2.add("Francia");
		paises2.add("Italia");
		paises2.add("Espania");
		
		Herramientas.recorrerColeccion(paises2);
		
		paises2.add("Italia");
		paises2.add("Espania");
		System.out.println("");
		
		Herramientas.recorrerColeccion(paises2);
	}
}

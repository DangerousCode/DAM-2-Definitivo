/*Crear hashmap donde vamos a guardar indicaciones por nivel de importancia, 
 * la clave es la que queramos, el valor es urgente, importante , normal y 
 * baja prioridad.
 * Mostrar la informacion guardada en el hashmap y mostrar urgente y normal
 */
package Ejercicios;
import java.util.*;

import herramientas.Herramientas;

public class EjemploHashMap {
	public static void main(String[] args){
		HashMap <String,String> prioridades=new HashMap <String,String>();
		prioridades.put("01", "urgente");
		prioridades.put("02", "importante");
		prioridades.put("03", "normal");
		prioridades.put("04", "baja prioridad");
		Herramientas.recorrerMapString(prioridades);
		
		System.out.println(prioridades.get("01")+", "+prioridades.get("03"));
	}
}

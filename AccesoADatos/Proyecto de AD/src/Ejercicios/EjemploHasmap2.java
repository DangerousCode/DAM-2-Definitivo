/*Crear hashmap donde vamos a guardar en la clave integer 100 200 300 y sus valores asociados seran rojo verde y azul respectivamente
Mostrar los datos del hashmap cambiar el valor rojo por negro y borrar el azul finalmente mostrar el hashmap*/
package Ejercicios;

import java.util.HashMap;

import herramientas.Herramientas;

public class EjemploHasmap2 {
	public static void main(String[] args){
		HashMap <Integer,String> prioridades=new HashMap <Integer,String>();
		prioridades.put(100, "rojo");
		prioridades.put(200, "verde");
		prioridades.put(300, "azul");
		
		Herramientas.recorrerMapInteger(prioridades);
		
		if(prioridades.containsKey(100)){
			prioridades.put(100, "negro");
		}
		else{
			System.out.println("No existe el objeto a cambiar");
		}
		System.out.println("");
		
		prioridades.remove(300);
		Herramientas.recorrerMapInteger(prioridades);
	}
}

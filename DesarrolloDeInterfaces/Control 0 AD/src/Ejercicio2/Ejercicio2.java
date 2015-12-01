/*
Vamos hacer un ejercicio que nos permita manejar objetos coche y sus matriculas

•	Clase Coche
Atributos: Marca (String), Modelo (String) y Caballos(double)

Métodos en la clase coche:
• set y get para los tres  atributos . Su constructor y  el método ToString


 Se nos informa que deberemos crear objetos de esta clase y guardarlos en la estructura  pertinente, teniendo en cuenta que para cada  objeto guardado le asociaremos una matricula que será única para cada coche. La Matricula será de tipo entero.

En una clase llamada Metodos.java debemos implementar los siguientes métodos:

•	 Método  isObjeto que buscará una matricula  en nuestra estructura  si está ,nos dirá que existe ese coche. Sino mensaje de que no lo encuentra.
 Cada vez que encontremos una matrícula además de informarnos que está ,deberemos guardar sólo  el objeto asociado en una colección. El tipo de colección la que creáis mejor.

•	Método  isPotente , que devuelve si es o no potente  en función de los caballos del coche .
(Caballos>=100 es potente,) . Cada vez que el coche es  potente , además  de informarnos que es  potente , deberemos guardar  sólo el objeto asociado en otra Colección.  El tipo de colección la que creáis mejor.

•	Método isComparar. Deberemos  mostrar los coches que existen y que son potentes, para ello usaremos las dos colecciones obtenidas en los dos métodos anteriores.

Programa Main
Para probar la funcionalidad de  vuestra clases, crear un método main() que:
•	 Crear la estructura que hayáis seleccionado
•	 Inserte 4 coches distintos con su matricula y su (marca,modelo y caballos)
•	 Imprimir el contenido de  la estructura, para comprobar que habéis hecho correctamente la inserción de datos
•	Llamar al método isObject
•	Llamar al método isPotente
•	Llamar al método isComparar
•	Mensaje de despedida

Debéis mostrarme un pequeño juego de prueba, con ello quiero decir, mostrarme como funciona con casos distintos
 
 */
package Ejercicio2;

import java.util.HashMap;

/**
 *
 * @author AlumnoT
 */
public class Ejercicio2 {
    public static void main(String[] args){
        HashMap<Integer,Coche> hm=new HashMap<Integer,Coche>();
        int matricula[]=new int[3];
        matricula[0]=158965;
        matricula[1]=898451;
        matricula[2]=894565;
        
        hm.put(matricula[0], new Coche("Ford","GT",506.26));
        hm.put(matricula[1], new Coche("Volkswagen","Golf",99.1));
        hm.put(matricula[2], new Coche("Ferrari","Enzo",629.89));
        
        
    }
}

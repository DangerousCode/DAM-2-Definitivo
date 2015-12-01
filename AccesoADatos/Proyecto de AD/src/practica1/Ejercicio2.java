package practica1;
import java.util.*;
import java.lang.*;
public class Ejercicio2 {

	public static void main(String[] args){
		HashMap<Integer,Profesor> hm1=new HashMap<Integer,Profesor>();
		HashMap<Integer,Profesor> hm2=new HashMap<Integer,Profesor>();
		
		Profesor prof1=new Profesor("Alvaro",20,"Bachiller");
		Profesor prof2=new Profesor("Alberto",30,"Ingeniero Industrial");
		Profesor prof3=new Profesor("Alvaro",20,"Bachiller");
		Profesor prof4=new Profesor("Jose",30,"Bachiller");
		Profesor prof5=new Profesor("Manuel", 42,"Ingeniero de Computadores");
		Profesor prof6=new Profesor("Alberto",30,"Ingeniero Industrial");
		
		hm1.put(1,prof1);
		hm1.put(2,prof2);
		hm1.put(3,prof5);
		hm2.put(1,prof3);
		hm2.put(2,prof4);
		hm2.put(3,prof6);
		
		Profesor.profesorRepetido(hm1,hm2);
		//Llamamos al metodo creado en la clase profesor para comprobar si hay algun repetido.
	}

}

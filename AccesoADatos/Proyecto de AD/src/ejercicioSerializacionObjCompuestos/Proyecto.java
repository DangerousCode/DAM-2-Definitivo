package ejercicioSerializacionObjCompuestos;
import java.io.*;
public class Proyecto implements Serializable{
	String nombre;
	Empleados jefeproyecto;
	OObjetos oobjetos;
	
	Proyecto(String nombre, Empleados jefeproyecto, OObjetos oobjetos){
		this.jefeproyecto=jefeproyecto;
		this.oobjetos=oobjetos;
		this.nombre=nombre;
	}
	
	public String toString(){
		return "El jefe es: "+jefeproyecto.nombre+" "+jefeproyecto.apellidos+", utilizando: "+oobjetos.nombrelenguaje+", IDE: "+oobjetos.software+", anyo creacion: "+oobjetos.anyocreacion;
	}
}

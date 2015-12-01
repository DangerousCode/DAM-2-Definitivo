package ejercicioSerializacionObjCompuestos;
import java.io.*;
public class Empleados implements Serializable{
	String nombre;
	String apellidos;
	int edad;
	String telefono;
	Empleados(){
		
	}
	Empleados(String nombre, String apellidos, int edad, String telefono){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.telefono=telefono;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setApellidos(String apellidos){
		this.apellidos=apellidos;
	}
	public void setEdad(int edad){
		this.edad=edad;
	}
	public void setTelefono(String telefono){
		this.telefono=telefono;
	}
	public String getNombre(){
		return nombre;
	}
	public String getApellidos(){
		return apellidos;
	}
	public int getEdad(){
		return edad;
	}
	public String getTelefono(){
		return telefono;
	}
}

package temaCero;
public class Persona{
	String rut="";
	String nombre="";
	Persona(){
		
	}
	Persona(String rut, String nombre){
		this.rut=rut;
		this.nombre=nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	public String getRut(){
		return rut;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setRut(String rut){
		this.rut=rut;
	}
	public String toString(){
		return "Clave: "+rut+", Nombre: "+nombre;
	}
}

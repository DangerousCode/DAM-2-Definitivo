package practica1;

public class Equipos {
	String nombre="";
	int cantidad=0;
	float precio=0;
	
	public Equipos() {

	}
	
	public Equipos(String nombre, int cantidad, float precio){
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.precio=precio;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getCantidad(){
		return cantidad;
	}
	
	public float getPrecio(){
		return precio;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setCantidad(int cantidad){
		this.cantidad=cantidad;
	}
	
	public void setPrecio(float precio){
		this.precio=precio;
	}
	
	public String toString(){
		return nombre;
	}
}

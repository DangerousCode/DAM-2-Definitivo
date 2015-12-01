package practica2;

public class Alumno {
	String nombre;
	double nota=0;
	Alumno(){
		
	}
	Alumno(String nombre, int nota){
		this.nombre=nombre;
		this.nota=nota;
	}
	public String getNombre(){
		return nombre;
	}
	public double getNota(){
		return nota;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setNota(double nota){
		this.nota=nota;
	}
}

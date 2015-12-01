package practica1;
import java.util.*;
import java.lang.*;
public class Profesor {
	
	String nombre="";
	int edad=0;
	String titulacion="";
	
	public Profesor() {
		// TODO Auto-generated constructor stub
	}
	
	public Profesor(String nombre, int edad, String titulacion){
		this.nombre=nombre;
		this.edad=edad;
		this.titulacion=titulacion;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setEdad(int edad){
		this.edad=edad;
	}
	
	public void setTitulacion(String titulacion){
		this.titulacion=titulacion;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getEdad(){
		return edad;
	}

	public String titulacion(){
		return titulacion;
	}
	
	public static void profesorRepetido(Map<Integer,Profesor> hm1,Map<Integer,Profesor> hm2){
		boolean flag=false;
		Profesor aux1=new Profesor();
		Profesor aux2=new Profesor();
		Iterator it=hm1.keySet().iterator();
		Iterator it2=hm2.keySet().iterator();
		
		//Creamos dos iteradores para recorrer ambas colecciones y comprobar si tienen siguiente.
		while(it.hasNext()){
			Integer clave=(Integer)it.next();
			aux1=(Profesor)hm1.get(clave);
			it2=hm2.keySet().iterator();
			while(it2.hasNext()){
				Integer clave2=(Integer)it2.next();
				aux2=(Profesor)hm2.get(clave2);
				//Guardamos los objetos obtenidos en auxiliares para poder compararlos.
				if(aux1.nombre.equals(aux2.nombre) && aux1.edad==aux2.edad && aux1.titulacion.equals(aux2.titulacion)){
					System.out.println("Profesores iguales con el nombre: "+aux1.nombre+", edad: "+aux1.edad+", y titulacion: "+aux1.titulacion);
					flag=true;
				}
			}
		}//fin while
		if(!flag){
			System.out.println("No hay profesores repetidos");
			//flag en caso de que no haya repetidos
		}
	}
}	

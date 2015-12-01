package practica1;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<Equipos>coleccion1=new ArrayList<Equipos>();
		ArrayList<Equipos>coleccion2=new ArrayList<Equipos>();
		
		Equipos aux=new Equipos();
		
		Equipos movil=new Equipos("Nexus", 50, 500);
		Equipos sobremesa=new Equipos("ASUS", 123, 600);
		Equipos portatil=new Equipos("HP", 249, 550);
		
		Equipos movildesc=new Equipos("NexusDesc", 50, (float)460.25);
		Equipos sobremesadesc=new Equipos("ASUSDesc", 123, (float)450.65);
		Equipos portatildesc=new Equipos("HPDesc", 249, (float)450.45);
		
		Equipos caro=movil;
		Equipos barato=movil;
		
		coleccion1.add(movil);
		coleccion1.add(sobremesa);
		coleccion1.add(portatil);
		
		coleccion2.add(movildesc);
		coleccion2.add(sobremesadesc);
		coleccion2.add(portatildesc);
		
		for(int i=0;i<3;i++){
			aux=coleccion1.get(i);
			if(aux.precio>caro.precio){
				caro=aux;
			}
			else{
				barato=aux;
			}
		}
		
		for(int i=0;i<3;i++){
			aux=coleccion2.get(i);
			if(aux.precio>caro.precio){
				caro=aux;
			}
			else{
				barato=aux;
			}
		}
		System.out.println("El mas caro es: "+caro+", y el mas barato es: "+barato);
	}

}

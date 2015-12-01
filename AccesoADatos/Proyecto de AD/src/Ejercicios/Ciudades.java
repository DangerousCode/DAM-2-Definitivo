package Ejercicios;
import java.util.*;

import herramientas.Herramientas;
public class Ciudades {
	public static void main(String[] args){
		int pos;
		String ciudad;
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList <String> listaCiudad=new ArrayList <String>();
		
		for(int i=0;i<4;i++){
                    System.out.print("Introduzca ciudad: ");
                    ciudad=sc.nextLine();
                    listaCiudad.add(ciudad);
		}
		System.out.println("\nLas ciudades son: ");
		Herramientas.recorrerColeccion(listaCiudad);
                
                System.out.println("\nLa primera ciudad es: "+listaCiudad.get(0));
                
                System.out.println("La tercera ciudad es: "+listaCiudad.get(2));
                
                System.out.println("\nIntroduce la posición a borrar: ");
                pos=Integer.parseInt(sc.nextLine());
                
                listaCiudad.remove(pos);
                
                Herramientas.recorrerColeccion(listaCiudad);
                
                System.out.println("\nIntroduce la ciudad a buscar: ");
                ciudad=sc.nextLine();
                
                if(listaCiudad.contains(ciudad)){
                    System.out.println("La ciudad introducida existe en el ArrayList.");
                }
                else{
                    System.out.println("La ciudad introducida no existe en el ArrayList");
                }
                
                System.out.println("\nIntroduzca la posición a cambiar por nulo: ");
                pos=Integer.parseInt(sc.nextLine());
                listaCiudad.set(pos, "nulo");
                
                Herramientas.recorrerColeccion(listaCiudad);
	}
}

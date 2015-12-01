package temaUnoSerializacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

import herramientas.Herramientas;

import java.io.*;
import java.util.*;

public class Metodos1 implements Serializable{
	public static Map<String,Persona> inicio() throws IOException{
		final int LONGITUD=1;
		String nombre;
		String apellidos;
		int edad=0;
		String DNI[]=new String[LONGITUD];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashMap<String,Persona> hm=new HashMap<String,Persona>();
		
		for(int i=0;i<DNI.length;i++){
			System.out.print("Introduce nombre: ");
			nombre=br.readLine();
			System.out.print("Introduce apellidos: ");
			apellidos=br.readLine();
			System.out.print("Introduce DNI: ");
			DNI[i]=br.readLine();
			System.out.print("Introduce edad: ");
			edad=Integer.parseInt(br.readLine());
			Persona persona=new Persona(nombre,apellidos,DNI[i],edad);
			hm.put(DNI[i], persona);
		}
		return hm;
	}
	
	public static void serializar()throws IOException,FileNotFoundException{
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Alvaro\\Desktop\\Ejercicio1.obj"));
		Herramientas.serializarObject(Metodos1.inicio(), oos);
		oos.close();
	}
	public static void desserializar() throws IOException,FileNotFoundException,ClassNotFoundException{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\Alvaro\\Desktop\\Ejercicio1.obj"));
		Herramientas.desserializarMap(ois);
		ois.close();
	}
}

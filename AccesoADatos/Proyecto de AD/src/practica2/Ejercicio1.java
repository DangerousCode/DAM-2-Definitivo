package practica2;
import java.io.*;
import java.util.*;
public class Ejercicio1 {
	public static void main(String[] args)throws IOException{
		final int LONGITUD=5;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashMap<String,Alumno> hm=new HashMap<String,Alumno>();		
		String[] DNI=new String[LONGITUD];
		
		for (int i=0;i<DNI.length;i++){
			Alumno alum=new Alumno();
			
			System.out.print("Introduce el DNI: ");
			DNI[i]=br.readLine();
			System.out.print("Introduce el nombre: ");
			alum.setNombre(br.readLine());
			System.out.print("Introduce la nota: ");
			alum.setNota(Double.parseDouble(br.readLine()));
			
			System.out.println("");
			
			hm.put(DNI[i], alum);
		}
		Alumno aux=new Alumno();
		String linea;
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\AlumnoT\\Desktop\\FichInfAlumno.txt"));
		for(int j=0;j<DNI.length;j++){
			aux=hm.get(DNI[j]);
			if(j==0){
				linea=DNI[j]+"#"+aux.getNombre()+"#"+aux.getNota();
				bw.write(linea);
			}
			else{
				linea="#"+DNI[j]+"#"+aux.getNombre()+"#"+aux.getNota();
				bw.write(linea);
			}
		}
		
		bw.close();
		
		int opcion;
		System.out.print("\nIntroduce la opcion<1,2,3>: ");
		opcion=Integer.parseInt(br.readLine());
		switch(opcion){
		case 1:
			Metodos.mostrarDatos();
		case 2:	
			System.out.println("La media de la clase es: "+Metodos.calcularMedia(LONGITUD));
		case 3:
			Metodos.alumnosSuperioresMedia(LONGITUD);
		}
	}
}

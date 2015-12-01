package practica2;
import java.io.*;
import java.util.StringTokenizer;
public class Metodos {
	public static void mostrarDatos() throws IOException{
		String linea;
		BufferedReader fr=new BufferedReader(new FileReader("C:\\Users\\AlumnoT\\Desktop\\FichInfAlumno.txt"));
		while((linea=fr.readLine())!=null){
			StringTokenizer st=new StringTokenizer(linea,"#");
			while(st.hasMoreTokens()){
				String DNIaux=st.nextToken();
				String nombre=st.nextToken();
				double nota=Double.parseDouble(st.nextToken());
				System.out.println("El DNI es: "+DNIaux+", el nombre es: "+nombre+", la nota es: "+nota);
			}
				
		}
		fr.close();
	}
	
	public static double calcularMedia(int LONGITUD) throws IOException{
		String linea;
		BufferedReader fr=new BufferedReader(new FileReader("C:\\Users\\AlumnoT\\Desktop\\FichInfAlumno.txt"));
		double nota=0;
		double medianotas=0;
		while((linea=fr.readLine())!=null){
			StringTokenizer st=new StringTokenizer(linea,"#");
			while(st.hasMoreTokens()){
				st.nextToken();
				st.nextToken();
				nota=Double.parseDouble(st.nextToken());
				medianotas=medianotas+nota;
			}
				
		}
		fr.close();
		return medianotas/LONGITUD;
	}
	
	public static void alumnosSuperioresMedia(int LONGITUD) throws IOException{
		double media=calcularMedia(LONGITUD);
		String linea;
		BufferedReader fr=new BufferedReader(new FileReader("C:\\Users\\AlumnoT\\Desktop\\FichInfAlumno.txt"));
		double nota=0;
		while((linea=fr.readLine())!=null){
			StringTokenizer st=new StringTokenizer(linea,"#");
			while(st.hasMoreTokens()){
				String DNI=st.nextToken();
				String nombre=st.nextToken();
				nota=Double.parseDouble(st.nextToken());
				if(nota>media){
					System.out.println(nombre+" "+DNI+", con nota: "+nota+" tiene una nota mayor que la media");
				}
			}
				
		}
		fr.close();
	}
}

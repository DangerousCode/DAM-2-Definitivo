package empleadosToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.io.*;

public class Metodos {
	public static void MostrarTodo()throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\AlumnoT\\Desktop\\empleados.txt"));
		String linea=null;
		while((linea=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(linea,"#");
			while(st.hasMoreTokens()){
				String nombre=st.nextToken();
				String edad=st.nextToken();
				String sueldo=st.nextToken();
				System.out.println(nombre+" "+edad+" "+sueldo);
			}
		}
		br.close();
	}
	
	public static void MostrarNoSueldo()throws IOException{
		String linea;
		BufferedReader br2=new BufferedReader(new FileReader("C:\\Users\\AlumnoT\\Desktop\\empleados.txt"));
		System.out.println("Los que no tienen sueldo: ");
		while((linea=br2.readLine())!=null){
			StringTokenizer st=new StringTokenizer(linea,"#");
			while(st.hasMoreTokens()){
				String nombre=st.nextToken();
				String edad=st.nextToken();
				String sueldo=st.nextToken();
				if(sueldo.equals(" ")){
					System.out.println(nombre+" "+edad+" "+sueldo);
				}
			}
		}
		br2.close();
	}
	
	public static void MostrarNoEdad() throws IOException{
		String linea;
		BufferedReader br3=new BufferedReader(new FileReader("C:\\Users\\AlumnoT\\Desktop\\empleados.txt"));
		System.out.println("Los que no tienen edad: ");
		while((linea=br3.readLine())!=null){
			StringTokenizer st=new StringTokenizer(linea,"#");
			while(st.hasMoreTokens()){
				String nombre=st.nextToken();
				String edad=st.nextToken();
				String sueldo=st.nextToken();
				if(edad.equals(" ")){
					System.out.println(nombre+" "+edad+" "+sueldo);
				}
			}
		}
		br3.close();
	}
	
	public static void MostrarViejoJoven() throws IOException{
		boolean flag=false;
		String linea;
		BufferedReader br4=new BufferedReader(new FileReader("C:\\Users\\AlumnoT\\Desktop\\empleados.txt"));
		String viejonom="";
		int viejoedad=0;
		String viejosueldo="";
		
		String jovennom="";
		int jovenedad=0;
		String jovensueldo="";
		
		while((linea=br4.readLine())!=null){
			StringTokenizer st=new StringTokenizer(linea,"#");
			while(st.hasMoreTokens()){
				String nombre=st.nextToken();
				String edad=st.nextToken();
				String sueldo=st.nextToken();
				
				if(!flag){
					viejonom=nombre;
					viejoedad=Integer.parseInt(edad);
					viejosueldo=sueldo;
					
					jovennom=nombre;
					jovenedad=Integer.parseInt(edad);
					jovensueldo=sueldo;
				}
				
				if(!edad.equals(" ")){
					if(Integer.parseInt(edad)>viejoedad){
						viejonom=nombre;
						viejoedad=Integer.parseInt(edad);
						viejosueldo=sueldo;
					}
					if(Integer.parseInt(edad)<jovenedad){
						jovennom=nombre;
						jovenedad=Integer.parseInt(edad);
						jovensueldo=sueldo;
					}
				}
				flag=true;
			}
		}
		System.out.println("El mas viejo es: "+viejonom+" "+viejoedad+" "+viejosueldo+" y el mas joven es: "+jovennom+" "+jovenedad+" "+jovensueldo);
		br4.close();
	}
}

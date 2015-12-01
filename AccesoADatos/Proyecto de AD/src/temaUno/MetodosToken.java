package temaUno;

import java.util.StringTokenizer;
import java.io.*;

public class MetodosToken {
	public static void FicheroCompleto(BufferedReader br) throws IOException{
		String linea;
		while((linea=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(linea,"!");
			while(st.hasMoreTokens()){
				String num=st.nextToken();
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
	public static int CantidadUnaCifra() throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\AlumnoT\\Desktop\\tokenizer.txt"));
		int cont=0;
		String linea;
		while((linea=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(linea,"!");
			while(st.hasMoreTokens()){
				int num=Integer.parseInt(st.nextToken());
				if(num<10 && num>=0){
					cont++;
				}
			}
		}
		br.close();
		return cont;
	}
	
	public static int CantidadUnaDosCifras() throws IOException{
		BufferedReader br2=new BufferedReader(new FileReader("C:\\Users\\AlumnoT\\Desktop\\tokenizer.txt"));
		int cont=0;
		String linea;
		while((linea=br2.readLine())!=null){
			StringTokenizer st=new StringTokenizer(linea,"!");
			while(st.hasMoreTokens()){
				int num=Integer.parseInt(st.nextToken());
				if(num>9){
					cont++;
				}
			}
		}
		br2.close();
		return cont;
	}
	
	public static void MediaAmbosCasos(BufferedReader br) throws IOException{
		String linea;
		float media1=0;
		float media2=0;
		while((linea=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(linea,"!");
			while(st.hasMoreTokens()){
				float num=Float.parseFloat(st.nextToken());
				if(num<10){
					media1=media1+num;
				}
				else{
					media2=media2+num;
				}
			}
		}
		System.out.println("La media de los de una cifra es: "+media1/MetodosToken.CantidadUnaCifra()+", y la media de mas de una es: "+media2/MetodosToken.CantidadUnaDosCifras());
	}
}

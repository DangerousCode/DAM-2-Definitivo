package temaUno;

import java.io.*;
/**
 * 
 * @author Alumnot
 *
 */
public class EjercicioCompletoTokenizer {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\AlumnoT\\Desktop\\tokenizer.txt"));
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce la opcion(1, 2, 3, 4): ");
		int opcion=Integer.parseInt(sc.readLine());
		switch(opcion){
		case 1:
			MetodosToken.FicheroCompleto(br);
			br.close();
			break;
		case 2:
			System.out.println("La cantidad de numeros de una cifra es: "+MetodosToken.CantidadUnaCifra());
			br.close();
			break;
		case 3:
			System.out.println("La cantidad de numeros de mas de una cifra es: "+MetodosToken.CantidadUnaDosCifras());
			br.close();
			break;
		case 4:
			MetodosToken.MediaAmbosCasos(br);
			br.close();
			break;
		}
	}
}


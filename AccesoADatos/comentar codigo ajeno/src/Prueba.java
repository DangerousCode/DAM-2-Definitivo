

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * 
 * @author Alumnot
 *
 */
public class Prueba {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Desktop\\cifras.txt"));
		String linea = null;
		int opcion;
		Scanner sc = new Scanner(System.in);
		int sum1 = 0, sum2 = 0, cont1 = 0, cont2 = 0;

		do {
			System.out.println("Menú");
			System.out.println("-----");
			System.out.println("1. Obtener listado. ");
			System.out.println("2. Cantidad de archivos de una cifra. ");
			System.out.println("3. Cantidad de numeros de dos o más cifras. ");
			System.out.println("4. Obtener media. ");
			System.out.println("5. Salir. ");
			System.out.println("Selecciona una opción: ");
			opcion = sc.nextInt();

			switch (opcion) {// Principio del menu (switch)
			case 1:
				while ((linea = br.readLine()) != null) {//While para leer fichero. Se repite en el resto de casos
					StringTokenizer st = new StringTokenizer(linea, "!");
					while (st.hasMoreTokens()) {//While para comprobar que tiene mas tokens. Se repite en el resto de casos
						String codigo = st.nextToken();
						System.out.println("Cifra: " + codigo);
					}

				}
				//Fin case 1
			case 2: {
				while ((linea = br.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(linea, "!");

					while (st.hasMoreTokens()) {
						String codigo = st.nextToken();
						if (codigo.length() < 2){
							System.out.println("Cifra: " + codigo + "\n");
						}
					}
				}
			}
				break;
				//Fin case 2
			case 3: {
				while ((linea = br.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(linea, "!");

					while (st.hasMoreTokens()) {
						String codigo = st.nextToken();
						if (codigo.length() > 1){
							System.out.println("Cifra: " + codigo + "\n");
						}
					}
				}
			}
				break;
				//Fin case 3
			case 4:
				while ((linea = br.readLine()) != null) {//While para leer el fichero
					StringTokenizer st = new StringTokenizer(linea, "!");

					while (st.hasMoreTokens()) {
						String codigo = st.nextToken();

						if (codigo.length() > 1) {
							sum1 = Integer.parseInt(codigo) + sum1;
							cont1++;
						}

						if (codigo.length() < 2) {
							sum2 = Integer.parseInt(codigo) + sum2;
							cont2++;
						}
					}

				}
				System.out.println("La media de los numeros de dos cifras es: " + sum1 / cont1 + "\n");
				System.out.println("La media de los numeros de dos cifras es: " + sum2 / cont2 + "\n");
				break;
				//Fin case4
			default:
				System.out.println("Fin de programa");
				br.close();
			}//Final del switch
			
		} while (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4);//Final del do while
	}
}
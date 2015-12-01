package temaUno;

import java.io.*;

import herramientas.Herramientas;

public class Ejercicio3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\AlumnoT\\Desktop\\RAF.txt", "rw");
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		String nombre;
		int codigo;
		double sueldo;

		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce el codigo: ");
			codigo = Integer.parseInt(sc.readLine());
			raf.writeInt(codigo);

			System.out.print("Introduce el nombre: ");
			nombre = sc.readLine();
			raf.writeUTF(Herramientas.convertUTF(nombre, 20));

			System.out.print("Introcue el sueldo: ");
			sueldo = Double.parseDouble(sc.readLine());
			raf.writeDouble(sueldo);
			System.out.print("\n\n");
		}
		
		raf.close();
		
		System.out.println("\nSe mostraran los datos del fichero:\n");
		
		RandomAccessFile rafr = new RandomAccessFile("C:\\Users\\AlumnoT\\Desktop\\RAF.txt", "r");
		
		
		for (int j = 0; j < 5; j++) {
			rafr.seek(j*34);
			System.out.println(rafr.readInt());
			System.out.println(rafr.readUTF());
			System.out.println(rafr.readDouble()+"\n");
		}
		
		rafr.seek(rafr.length()-34);
		
		System.out.println("Se mostrara el ultimo registro: \n");
		
		System.out.println(rafr.readInt());
		System.out.println(rafr.readUTF());
		System.out.println(rafr.readDouble());
		
		rafr.seek(0);
		rafr.seek(2*34);
		
System.out.println("\nSe mostrara el tercer registro: \n");
		
		System.out.println(rafr.readInt());
		System.out.println(rafr.readUTF());
		System.out.println(rafr.readDouble());
		
		rafr.close();
	}
}

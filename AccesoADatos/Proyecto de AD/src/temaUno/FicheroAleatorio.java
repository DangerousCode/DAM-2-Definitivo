package temaUno;
import java.io.*;
import java.io.IOException;
import java.io.RandomAccessFile;

import herramientas.Herramientas;

public class FicheroAleatorio {
	public static void main(String[] args) throws IOException{
			RandomAccessFile RAF=new RandomAccessFile("C:\\Users\\Alumnot\\Desktop\\RAF.txt", "rw");
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			
			for(int i=0;i<3;i++){
				System.out.print("Nombre: ");
				RAF.writeUTF(Herramientas.convertUTF(teclado.readLine(), 20));
			}
			
            RandomAccessFile x = new RandomAccessFile("C:\\Users\\Alumnot\\Desktop\\RAF.txt", "r");
            
            for (int i = 0; i < 3; i++) {
                x.seek(i * 22);
                String nombre = x.readUTF();
                System.out.println(nombre);
            }
            
            x.close();
            RAF.close();
	}
}



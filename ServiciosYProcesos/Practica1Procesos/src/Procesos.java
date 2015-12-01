import java.io.*;
//IMPORTANTE: CAMBIAR EL USUARIO DEL EQUIPO EN CADA RUTA. TANTO EN EL .bat COMO EN ESTE CODIGO.
public class Procesos {

	public static void main(String[] args) throws IOException, InterruptedException{
		
		String linea;
		Process p=Runtime.getRuntime().exec("C:\\Users\\Alvaro\\Desktop\\practica.bat");
		BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
		while((linea=br.readLine())!=null){
			System.out.println(linea);
		}
		
		File[] fOut=new File[5];
		ProcessBuilder[] pb=new ProcessBuilder[5];
		
		for(int i=0;i<5;i++){
			fOut[i]=new File("C:\\Users\\Alvaro\\Desktop\\salidaUsuario"+(i+1)+".txt");
			pb[i]=new ProcessBuilder("CMD","/C","cd \"C:\\Users\\Alvaro\\Desktop\\Usuario"+(i+1)+"\" && dir");
			pb[i].redirectOutput(fOut[i]);
		}
		
		for(int i=0;i<5;i++){
			pb[i].start();
		}
		Thread.sleep(40);
		for(int i=0;i<5;i++){
			System.out.println("Lectura del "+(i+1)+"o fichero.\n");
			Metodos.leerFicheros("C:\\Users\\Alvaro\\Desktop\\salidaUsuario"+(i+1)+".txt");
			System.out.println("\nFinal de lectura del "+(i+1)+"o fichero.\n");
		}
	}
}
	

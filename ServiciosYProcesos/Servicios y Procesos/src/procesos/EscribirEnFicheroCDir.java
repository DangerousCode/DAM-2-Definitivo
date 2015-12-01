package procesos;
import java.io.*;
public class EscribirEnFicheroCDir {
	public static void main(String[] args) throws IOException{
		ProcessBuilder pb=new ProcessBuilder("CMD","/C","ipconfig/all");
		
		File fOut=new File("C:\\Users\\AlumnoT\\Desktop\\salida.txt");
		File fErr=new File("C:\\Users\\AlumnoT\\Desktop\\error.txt");
		
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		pb.start();
	}

}

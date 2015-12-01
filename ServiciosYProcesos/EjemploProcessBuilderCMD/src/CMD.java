import java.io.*;
public class CMD {
	public static void main(String[] args) throws IOException{
		ProcessBuilder pb=new ProcessBuilder("CMD","/C","dir");
		File fOut=new File("C:\\Users\\Alvaro\\Desktop\\salida"+1+".txt");
		File fErr=new File("C:\\Users\\Alvaro\\Desktop\\salidaerr.txt");
		
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		pb.start();
	}
}

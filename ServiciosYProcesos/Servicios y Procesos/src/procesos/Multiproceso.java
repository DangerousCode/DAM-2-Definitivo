package procesos;
import java.io.IOException;
import java.util.*;
public class Multiproceso {

	public static void main(String[] args) throws IOException, InterruptedException{
		ProcessBuilder pb1=new ProcessBuilder("NOTEPAD");
		ProcessBuilder pb2=new ProcessBuilder("EXPLORER");
		
		Process p=pb1.start();
		System.out.println("Ejecucion de NOTEPAD");
		p.waitFor();
		
		Process p2=pb2.start();
		System.out.println("Ejecucion de EXPLORER");
	}

}

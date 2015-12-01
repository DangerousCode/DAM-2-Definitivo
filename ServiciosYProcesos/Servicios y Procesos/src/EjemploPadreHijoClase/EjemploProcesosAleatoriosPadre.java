package EjemploPadreHijoClase;
import java.io.*;
public class EjemploProcesosAleatoriosPadre {

	public static void main(String[] args) throws IOException{
		String line;
		
		Process hijo=new ProcessBuilder("C:\\Users\\Alumnot\\Desktop\\Rand1.exe").start();
		BufferedReader br=new BufferedReader(new InputStreamReader(hijo.getInputStream()));
		PrintStream ps=new PrintStream(hijo.getOutputStream());
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		while((in.readLine()).compareTo(("fin"))!=0){
			ps.println("");
			ps.flush();
			if((line=br.readLine())!=null){
				System.out.println(line);
				System.out.println("Finalizado");
			}
		}
	}

}

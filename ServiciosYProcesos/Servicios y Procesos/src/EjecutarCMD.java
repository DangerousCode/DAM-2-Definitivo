import java.io.*;
public class EjecutarCMD {
	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();

		String Comando="CMD /C SHUTDOWN/R";

		Process p=null;

		try {

		p=r.exec(Comando);

		InputStream is=p.getInputStream();

		BufferedReader br=new BufferedReader (new InputStreamReader (is));

		String linea;

		while((linea=br.readLine())!=null){ //lee una linea
		

			System.out.println(linea);
		}

		br.close();

		} catch (Exception e){
			e.printStackTrace();
		}

		// Comprobando error - 0 bien - 1 mal

		int exitVal;

		try{

		exitVal=p.waitFor(); //Padre bloqueado hasta que el hijo finalice su ejecución

		System.out.println("Valor de Salida: " + exitVal);

		

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		}
}

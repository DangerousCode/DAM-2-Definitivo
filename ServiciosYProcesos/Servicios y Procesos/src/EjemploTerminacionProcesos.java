import java.io.IOException;
public class EjemploTerminacionProcesos {
	public static void main(String[] args){
		if(args.length<=0){
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		
		Runtime runtime=Runtime.getRuntime();
		try{
			Process process=runtime.exec(args);
			process.destroy();
		}
		catch(Exception e){
			System.err.println("Excepcion de E/S");
			System.exit(-1);
		}
	}
}

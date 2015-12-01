package aeropuerto;
import java.util.Random;
public class Tiempo extends Thread{
	//Finaliza el Thread.
	boolean booleano;
	Tiempo(boolean booleano){
		this.booleano=booleano;
	}
	public void run(){
		Random aleatorio=new Random();
		try{
			while(!booleano){
				Creador.tiempo=aleatorio.nextInt(5);
				Thread.sleep(1000);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

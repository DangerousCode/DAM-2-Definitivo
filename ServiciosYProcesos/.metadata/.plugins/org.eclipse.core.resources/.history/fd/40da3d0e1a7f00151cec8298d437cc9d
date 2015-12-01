package tg;
import java.util.concurrent.*;
public class Madre extends Thread {
	Semaphore semaforo;
	int ninios;
	Madre(Semaphore semaforo, int ninios){
		this.semaforo=semaforo;
		this.ninios=ninios;
	}
	public void run(){
		for(int i=0;i<ninios;i++){
			semaforo.release();
		}
		System.out.println("He rellenado el frasco");
	}
}

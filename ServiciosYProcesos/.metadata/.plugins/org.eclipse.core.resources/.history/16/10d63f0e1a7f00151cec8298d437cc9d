package tg;
import java.util.concurrent.*;
public class Ninio extends Thread{
	Semaphore semaforo;
	Madre madre;
	Ninio(Semaphore semaforo, Madre madre){
		this.semaforo=semaforo;
		this.madre=madre;
	}
	public void run(){
		try{
			semaforo.acquire();
			System.out.println("He cogido una galleta");
		}catch(InterruptedException e){
			madre.start();
		}
	}
}

package tg;
import java.util.concurrent.*;
public class Madre extends Thread {
	Semaphore semaforomadre;
	Semaphore semaforoninios;
	Madre(Semaphore semaforomadre, Semaphore semaforoninios){
		this.semaforomadre=semaforomadre;
		this.semaforoninios=semaforoninios;
	}
	public void run(){
		try{
			while(true){
				semaforomadre.acquire();
				Creador.galletas=10;
				System.out.println("He rellenado el frasco, seguid comiendo, gorditos mios");
				semaforoninios.release();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

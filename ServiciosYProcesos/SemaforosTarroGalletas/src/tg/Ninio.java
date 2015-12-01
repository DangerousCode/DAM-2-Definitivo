package tg;
import java.util.concurrent.*;
public class Ninio extends Thread{
	Semaphore semaforoninios;
	Semaphore semaforomadre;
	Ninio(Semaphore semaforoninios, Semaphore semaforomadre){
		this.semaforoninios=semaforoninios;
		this.semaforomadre=semaforomadre;
	}
	public void run(){
		try{
			while(true){
				semaforoninios.acquire();
					Creador.galletas--;
					System.out.println("He cogido una galleta, quedan: "+Creador.galletas);
					if(Creador.galletas==0){
						System.out.println("¡Mama no quedan galletas!");
						semaforomadre.release();
					}
					else{
						semaforoninios.release();
					}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

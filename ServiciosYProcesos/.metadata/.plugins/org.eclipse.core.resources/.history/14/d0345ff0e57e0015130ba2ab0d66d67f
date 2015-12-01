/**
 * 
 */
package aeropuerto;
import java.util.concurrent.*;
/**
 * @author Alvaro
 *
 */
public class Aviones extends Thread{
	Semaphore Pista;
	public void run(){
		try{
			Pista.acquire();
		}catch(InterruptedException e){
			System.out.println("Excepcion de interrupcion");
		}
	}
}

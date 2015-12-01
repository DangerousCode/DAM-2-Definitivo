package creador;
import java.util.concurrent.*;
import java.util.*;
public class RobotPaquetes extends Thread{
	Semaphore sempaq;
	char direccion;
	RobotPaquetes(Semaphore sempaq,char direccion){
		this.sempaq=sempaq;
		this.direccion=direccion;
	}
	public void run(){
		//Se crean dos random para el peso y la direccion.
		Random randdireccion=new Random();
		Random randpeso=new Random();
		try{
			while(true){
				sempaq.acquire();
					switch(randdireccion.nextInt(3)){
					case 1:
						Paquete paqueteL=new Paquete('L',randpeso.nextInt(100));
						Cinta.AniadirPaquete(paqueteL);
						break;
					case 2:
						Paquete paqueteN=new Paquete('N',randpeso.nextInt(100));
						Cinta.AniadirPaquete(paqueteN);
						break;
					case 3:
						Paquete paqueteI=new Paquete('I',randpeso.nextInt(100));
						Cinta.AniadirPaquete(paqueteI);
						break;
					}
				sempaq.release();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

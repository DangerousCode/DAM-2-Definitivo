package hilos;

public class CreacionYArranqueDeHilos implements Runnable{
	Thread t;
	CreacionYArranqueDeHilos(){
		t=new Thread(this,"Nuveo Thread");
		System.out.println("Creado hilo: "+t);
		t.start();
	}
	
	public void run(){
		for(int i=0;i<4;i++){
			System.out.println("Hola desde el hilo creado");
		}
		System.out.println("HIlo finalizado");
	}
}
class RunThread{
	public static void main(String[] args){
		new CreacionYArranqueDeHilos();
		for(int j=0;j<4;j++){
			System.out.println("Hola desde el hilo principal");
		}
		System.out.println("Proceso acabando");
		
	}
}

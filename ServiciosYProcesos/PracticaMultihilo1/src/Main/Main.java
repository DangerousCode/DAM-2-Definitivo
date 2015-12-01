package Main;

public class Main extends Thread{
	public static void main(String[] args) throws InterruptedException{
		
		Resultados resultado=new Resultados();
		
		Hilo hilo1=new Hilo(1, resultado);
		Hilo hilo2=new Hilo(2, resultado);
		Hilo hilo3=new Hilo(3, resultado);
		Hilo hilo4=new Hilo(4, resultado);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		
		hilo1.join();
		hilo2.join();
		hilo3.join();
		hilo3.join();
		
		System.out.println(resultado);
		
	}
}

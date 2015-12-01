package calculos;

public class Hilo extends Thread{
	int numeros=0;
	Suma suma;
	int sumatotal=0;
	Hilo(){
		
	}
	public Hilo(int numeros, Suma suma){
		this.numeros=numeros;
		this.suma=suma;
	}
	public void run(){
		for (int i=1;i<numeros;i++){
			sumatotal+=i;
		}
		suma.sumaTotal(sumatotal);
	}
}

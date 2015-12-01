package calculos;

public class Hilo extends Thread{
	int sumanum=0;
	int veces=0;
	Suma sumatotal;
	int parametro=0;
	String nombre;
	Ventanas ventana=new Ventanas(nombre);
	Hilo(){
		
	}
	Hilo(int veces, Suma sumatotal, int parametro, String nombre){
		this.veces=veces;
		this.sumatotal=sumatotal;
		this.parametro=parametro;
		this.nombre=nombre;
	}
	public void run(){
		for(int i=veces;i>0;i--){
			sumanum=sumanum+parametro;
			parametro--;
			ventana.escribecadena("Valor actual de la suma del "+nombre+" : "+sumanum+"\n");
		}
		ventana.escribecadena("\nLa suma del "+nombre+" es: "+sumanum);
		sumatotal.sumarNumerosHilos(sumanum);
	}
}
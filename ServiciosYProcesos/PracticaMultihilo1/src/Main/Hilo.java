package Main;

public class Hilo extends Thread{
	int hilo=0;
	Resultados resultado;
	int naturales=0;
	int multiplica=1;
	int pares=0;
	int impares=0;
	Hilo(){
		
	}
	Hilo(int hilo, Resultados resultado){
		this.hilo=hilo;
		this.resultado = resultado;
		System.out.println("Creado hilo: "+hilo);
	}
	public void run(){
		
		switch(hilo){
		case 1:
			for (int i=1;i<11;i++){
				naturales=naturales+i;
			}
			resultado.setSuma(naturales);
		case 2:
			for (int j=1;j<11;j++){
				multiplica=multiplica*j;
			}
			resultado.setMult(multiplica);
		case 3:
			for (int k=1;k<21;k++){
				if(k%2==0){
					pares=pares+k;
				}
			}
			resultado.setPares(pares);
		case 4:
			for (int l=1;l<21;l++){
				if(l%2==1){
					impares=impares+l;
				}
			}
			resultado.setImpares(impares);
		}
	}
}

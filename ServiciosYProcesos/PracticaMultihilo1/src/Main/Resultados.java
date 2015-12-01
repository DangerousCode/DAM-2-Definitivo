package Main;

public class Resultados {
	int suma=0;
	int multiplica=0;
	int pares=0;
	int impares=0;
	Resultados(){
		
	}
	public void setSuma(int suma){
		this.suma=suma;
	}
	public void setMult(int multiplica){
		this.multiplica=multiplica;
	}
	public void setPares(int pares){
		this.pares=pares;
	}
	public void setImpares(int impares){
		this.impares=impares;
	}
	
	public String toString() {
		return "Resultado 1: " + suma + "\nResultado 2: " + multiplica + "\nResultado 3: " + pares + "\nResultado 4: " + impares;
	}
}

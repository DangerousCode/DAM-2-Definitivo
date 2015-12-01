package creador;
public class Paquete {
	String direccion;
	int peso;
        int id;
	Paquete(){
		
	}
	Paquete(int id,String direccion,int peso){
		this.direccion=direccion;
		this.peso=peso;
                this.id=id;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
}

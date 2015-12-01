package ejercicioSerializacionObjCompuestos;

public class OObjetos extends Lenguaje{
	int anyocreacion;
	String definicionobjeto;
	
	
	OObjetos(int anyocreacion, String definicionobjeto,String nombrelenguaje,String software){
		super(nombrelenguaje,software);
		this.anyocreacion=anyocreacion;
		this.definicionobjeto=definicionobjeto;
	}
	
	OObjetos(){
		
	}
	
	public void setAnyoCreacion(int anyocreacion){
		this.anyocreacion=anyocreacion;
	}
	
	public void setDefinicionObjeto(String definicionobjeto){
		this.definicionobjeto=definicionobjeto;
	}
}

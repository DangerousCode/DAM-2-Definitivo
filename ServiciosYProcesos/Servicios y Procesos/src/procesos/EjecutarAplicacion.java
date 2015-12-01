package procesos;

public class EjecutarAplicacion {
	public static void main(String[] args){
        Runtime r=Runtime.getRuntime();
        String comando="C:\\Users\\AlumnoT\\Desktop\\Carpetas.bat";
        Process p;
        try{
        	p=r.exec(comando);
        }
        catch(Exception e){
            System.out.println("Error en: "+comando);
            e.printStackTrace();
        }
    }
}
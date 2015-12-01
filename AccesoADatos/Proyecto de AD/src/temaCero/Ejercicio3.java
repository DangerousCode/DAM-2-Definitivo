package temaCero;
import java.util.*;

import herramientas.Herramientas;
public class Ejercicio3 {
	public static void main(String[] args){
		HashMap<String,String> agenda=new HashMap<String,String>();
		agenda.put("Doctor", "(+52)-4000-5000");
		agenda.put("Hermano", "(575)-2042-3233");
		agenda.put("Tio", "(421)-1010-0020");
		agenda.put("Suegros", "(334)-6105-4334");
		agenda.put("Oficina", "(304)-5205-8454");
		agenda.put("Abogado", "(756)-1205-3454");
		agenda.put("Papa", "(55)-9555-3270");
		agenda.put("Tienda", "(874)-2400-8600");
		
		Herramientas.recorrerMapString(agenda);
	}
}

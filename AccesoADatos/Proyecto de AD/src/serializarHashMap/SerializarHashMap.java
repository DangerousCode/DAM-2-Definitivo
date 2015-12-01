package serializarHashMap;
import serializacionObjeto.*;
import java.util.*;

import herramientas.Herramientas;

import java.io.*;
public class SerializarHashMap {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		HashMap<Integer,Contacto> hm = new HashMap<Integer,Contacto>();
		Contacto contacto = new Contacto("Alvaro","637322296");
		hm.put(1, contacto);
		ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("C:\\Users\\AlumnoT\\Desktop\\phashmap.obj"));
		Herramientas.serializarObject(hm,salida);
		salida.close();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\AlumnoT\\Desktop\\phashmap.obj"));
		Herramientas.desserializarMap(ois);
		ois.close();
	}

}

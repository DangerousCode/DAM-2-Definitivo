/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 •	 Método  isObjeto que buscará una matricula  en nuestra estructura  si está ,nos dirá que existe ese coche. Sino mensaje de que no lo 
 encuentra.
 Cada vez que encontremos una matrícula además de informarnos que está ,deberemos guardar sólo  el objeto asociado en una colección. 
 El tipo de colección la que creáis mejor.

 •	Método  isPotente , que devuelve si es o no potente  en función de los caballos del coche .
 (Caballos>=100 es potente,) . Cada vez que el coche es  potente , además  de informarnos que es  potente , deberemos guardar  sólo 
 el objeto asociado en otra Colección.  El tipo de colección la que creáis mejor.

 •	Método isComparar. Deberemos  mostrar los coches que existen y que son potentes, para ello usaremos las dos c
 olecciones obtenidas en los dos métodos anteriores.

 */
package control.pkg0.ad;

import Ejercicio2.Coche;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author AlumnoT
 */
public class Metodos {

    public static ArrayList<String> leerFicheroToken(String nombre) throws IOException {
        ArrayList<String> al = new ArrayList<String>();
        String linea = "";
        BufferedReader fr = new BufferedReader(new FileReader(nombre));
        linea = fr.readLine();
        StringTokenizer st = new StringTokenizer(linea, ";");
        while (st.hasMoreTokens()) {
            al.add(st.nextToken());
        }
        for (int i = 0; i < al.size(); i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i).equals(al.get(j))) {
                    al.remove(j);
                }
            }
        }
        return al;
    }

    /*
     •	 Método  isObjeto que buscará una matricula  en nuestra estructura  si está ,nos dirá que existe ese coche. Sino mensaje de que no lo 
     encuentra.
     Cada vez que encontremos una matrícula además de informarnos que está ,deberemos guardar sólo  el objeto asociado en una colección. 
     El tipo de colección la que creáis mejor.
     */
    public static void isObjeto(Integer matricula, HashMap<Integer, Coche> hm, ArrayList<Coche> coche) {
        if (hm.containsKey(matricula)) {
            System.out.println("La matricula introducida existe. Se ha aniadido a la coleccion");
            coche.add(hm.get(matricula));
        } else {
            System.out.println("La matricula introducida no existe.");
        }
    }

    /*
     •	Método  isPotente , que devuelve si es o no potente  en función de los caballos del coche .
     (Caballos>=100 es potente,) . Cada vez que el coche es  potente , además  de informarnos que es  potente , deberemos guardar  sólo 
     el objeto asociado en otra Colección.  El tipo de colección la que creáis mejor.
     */
    public static void isPotente(Integer matricula, HashMap<Integer, Coche> hm, ArrayList<Coche> potentes) {
        if (hm.get(matricula).getCaballos() >= 100) {
            System.out.println("El coche es potente.");
            potentes.add(hm.get(matricula));
        } else {
            System.out.println("El coche no es potente.");
        }
    }

    /*
     •	Método isComparar. Deberemos  mostrar los coches que existen y que son potentes, para ello usaremos las dos c
     olecciones obtenidas en los dos métodos anteriores.
     */
    public static void isComparar(ArrayList<Coche> coche, ArrayList<Coche> potentes) {
        for (int i = 0; i < coche.size(); i++) {
            coche.get(i).toString();
        }
        for (int i = 0; i < coche.size(); i++) {
            potentes.get(i).toString();
        }
    }
}

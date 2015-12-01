/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temaUnoTokens;
import herramientas.Herramientas;
import java.io.*;
import java.util.*;
/**
 *
 * @author Alumnot
 */
public class Ejercicio1 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\AlumnoT\\Desktop\\fich.txt"));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String linea;
        linea=br.readLine();
        StringTokenizer st=new StringTokenizer(linea," ");
        while(st.hasMoreTokens()){
            bw.write(st.nextToken());
        }
        bw.close();
        
        Herramientas.leerFichero("C:\\Users\\AlumnoT\\Desktop\\fich.txt");
    }
}

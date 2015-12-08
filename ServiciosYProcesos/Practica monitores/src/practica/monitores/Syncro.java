/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.monitores;

/**
 *
 * @author AlumnoT
 */
public class Syncro {
    Syncro()
    {
        
    }
    
    public synchronized int comprar(int numero, String producto, Cajera cajera[], Ventanas ventanas[], double precio) throws InterruptedException{
        boolean comprado=false;
        int numcaja=0;
        while(!comprado){
            wait();
            if(!cajera[0].ocupada){
                cajera[0].setOcupada(true);
                ventanas[0].escribecadena("Soy la persona "+numero+" y he comprado "+producto+" en la caja: "+cajera[0].id+"\n\n");
                cajera[0].sumRecaudacion(precio);
                comprado=true;
                numcaja=0;
            }
            else if(!cajera[1].ocupada){
                cajera[1].setOcupada(true);
                ventanas[1].escribecadena("Soy la persona "+numero+" y he comprado "+producto+" en la caja: "+cajera[1].id+"\n\n");
                cajera[1].sumRecaudacion(precio);
                comprado=true;
                numcaja=1;
            }
            else if(!cajera[2].ocupada){
                cajera[2].setOcupada(true);
                ventanas[2].escribecadena("Soy la persona "+numero+" y he comprado "+producto+" en la caja: "+cajera[2].id+"\n\n");
                cajera[2].sumRecaudacion(precio);
                comprado=true;
                numcaja=2;
            }
        }
        return numcaja;
    }
    
    public synchronized void despertar(){
        notify();
    }
}

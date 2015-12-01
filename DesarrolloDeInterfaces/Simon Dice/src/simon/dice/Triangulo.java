/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simon.dice;

import java.awt.Graphics;

/**
 *
 * @author AlumnoT
 */
public class Triangulo {
    int a;
    int b;
    int x;
    int y;
    Triangulo(){
        a=50;
        b=50;
        x=150;
        y=150;
    }
    public void pintar(Graphics g){
        g.drawLine(x, y, x+(b/2), y+a);
        g.drawLine(x+(b/2), y+a, x-(b/2), y+a);
        g.drawLine(x, y, x-(b/2), y+a);
        
    }
}

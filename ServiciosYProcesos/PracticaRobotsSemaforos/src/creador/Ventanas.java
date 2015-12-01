package creador;
import java.awt.*;
import java.lang.*;
import java.io.*;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Ventanas {
	JFrame ventana=new JFrame();
	TextArea texto_ventana=new TextArea();
	Ventanas(String nombre){
		ventana.setName(nombre);
		ventana.setTitle(nombre);
		ventana.setSize(500, 400);
		ventana.setVisible(true);
		ventana.add(texto_ventana);
	}
	public void escribecadena(String sumanum){
		texto_ventana.setText(texto_ventana.getText()+sumanum);
	}
}

package interfaz;

import java.awt.*;
import java.awt.event.*;

public class Gui extends Frame {
	Button b1, b2, b3;

	Gui() {
		setTitle("Titulo de la ventana");
		setLayout(new FlowLayout());
		setSize(400, 200);
		setVisible(true);
		b1 = new Button("Aceptar");
		b2 = new Button("Cancelar");
		b3 = new Button("Salir");

		b1.addActionListener(new EscuchaAceptar());
		b2.addActionListener(new EscuchaCancelar());
		b3.addActionListener(new EscuchaSalir());

		add(b1);
		add(b2);
		add(b3);
	}

	class EscuchaAceptar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b1){
				System.out.println("HAS PULSADO ACEPTAR");
			}
		}
	}
		
	class EscuchaCancelar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b2){
				System.out.println("HAS PULSADO CANCELAR");
			}
		}
	}
	
	class EscuchaSalir implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b3){
				System.out.println("Se cerrará la ventana");
				System.exit(0);
			}
		}
	}
}

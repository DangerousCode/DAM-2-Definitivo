package interfaz;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Abb extends JFrame {
	JPanel contentPane;
	JTextField caja1;
	JTextField caja2;
	JLabel lblresul;
	JLabel lblnum1;
	JLabel lblnum2;
	JButton b1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Abb frame = new Abb();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Abb() {
		setTitle("MiniCalculadora");
		setBounds(100, 100, 334, 269);
		getContentPane().setLayout(null);
		lblnum1 = new JLabel("Escriba el primer n\u00FAmero ...");
		lblnum1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblnum1.setBounds(6, 41, 202, 26);
		getContentPane().add(lblnum1);
		lblnum2 = new JLabel("Escriba el segundo n\u00FAmero ...");
		lblnum2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblnum2.setBounds(6, 94, 202, 26);
		getContentPane().add(lblnum2);
		caja1 = new JTextField();
		caja1.setBounds(220, 41, 74, 28);
		getContentPane().add(caja1);
		caja2 = new JTextField();
		caja2.setBounds(220, 94, 74, 28);
		getContentPane().add(caja2);
		b1 = new JButton("+");
		b1.setFont(new Font("SansSerif", Font.PLAIN, 30));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int v1 = Integer.parseInt(caja1.getText());
				int v2 = Integer.parseInt(caja2.getText());
				String suma = Integer.toString(v1 + v2);
				lblresul.setText(suma);
			}
		});
		b1.setBounds(220, 134, 74, 39);
		getContentPane().add(b1);
		lblresul = new JLabel("Suma");
		lblresul.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
		lblresul.setBounds(230, 176, 64, 46);
		getContentPane().add(lblresul);
	}
}

package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
					.addGap(5))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
					.addContainerGap())
		);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{39, 40, 0, 0, 89, 0};
		gbl_panel.rowHeights = new int[]{23, 23, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnUno = new JButton("1");
		btnUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string;
				string = textField.getText();
				string+=btnUno.getText();
				textField.setText(string);
			}
		});
		GridBagConstraints gbc_btnUno = new GridBagConstraints();
		gbc_btnUno.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnUno.insets = new Insets(0, 0, 5, 5);
		gbc_btnUno.gridx = 0;
		gbc_btnUno.gridy = 0;
		panel.add(btnUno, gbc_btnUno);
		
		JButton btnDos = new JButton("2");
		btnDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string;
				string = textField.getText();
				string+=btnDos.getText();
				textField.setText(string);
			}
		});
		GridBagConstraints gbc_btnDos = new GridBagConstraints();
		gbc_btnDos.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnDos.insets = new Insets(0, 0, 5, 5);
		gbc_btnDos.gridx = 1;
		gbc_btnDos.gridy = 0;
		panel.add(btnDos, gbc_btnDos);
		
		JButton btnTres = new JButton("3");
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string;
				string = textField.getText();
				string+=btnTres.getText();
				textField.setText(string);
			}
		});
		GridBagConstraints gbc_btnTres = new GridBagConstraints();
		gbc_btnTres.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnTres.insets = new Insets(0, 0, 5, 5);
		gbc_btnTres.gridx = 2;
		gbc_btnTres.gridy = 0;
		panel.add(btnTres, gbc_btnTres);
		
		JButton btnMas = new JButton("+");
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string;
				string = textField.getText();
				string+=btnMas.getText();
				textField.setText(string);
			}
		});
		GridBagConstraints gbc_btnMas = new GridBagConstraints();
		gbc_btnMas.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMas.gridwidth = 2;
		gbc_btnMas.insets = new Insets(0, 0, 5, 0);
		gbc_btnMas.gridx = 3;
		gbc_btnMas.gridy = 0;
		panel.add(btnMas, gbc_btnMas);
		
		JButton btnCuatro = new JButton("4");
		btnCuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string;
				string = textField.getText();
				string+=btnCuatro.getText();
				textField.setText(string);
			}
		});
		GridBagConstraints gbc_btnCuatro = new GridBagConstraints();
		gbc_btnCuatro.insets = new Insets(0, 0, 5, 5);
		gbc_btnCuatro.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnCuatro.gridx = 0;
		gbc_btnCuatro.gridy = 1;
		panel.add(btnCuatro, gbc_btnCuatro);
		
		JButton btnCinco = new JButton("5");
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string;
				string = textField.getText();
				string+=btnCinco.getText();
				textField.setText(string);
			}
		});
		GridBagConstraints gbc_btnCinco = new GridBagConstraints();
		gbc_btnCinco.insets = new Insets(0, 0, 5, 5);
		gbc_btnCinco.gridx = 1;
		gbc_btnCinco.gridy = 1;
		panel.add(btnCinco, gbc_btnCinco);
		
		JButton btnSeis = new JButton("6");
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string;
				string = textField.getText();
				string+=btnSeis.getText();
				textField.setText(string);
			}
		});
		GridBagConstraints gbc_btnSeis = new GridBagConstraints();
		gbc_btnSeis.insets = new Insets(0, 0, 5, 5);
		gbc_btnSeis.gridx = 2;
		gbc_btnSeis.gridy = 1;
		panel.add(btnSeis, gbc_btnSeis);
		
		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string;
				string = textField.getText();
				string+=btnMenos.getText();
				textField.setText(string);
			}
		});
		GridBagConstraints gbc_btnMenos = new GridBagConstraints();
		gbc_btnMenos.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMenos.gridwidth = 2;
		gbc_btnMenos.insets = new Insets(0, 0, 5, 0);
		gbc_btnMenos.gridx = 3;
		gbc_btnMenos.gridy = 1;
		panel.add(btnMenos, gbc_btnMenos);
		
		JButton btnSiete = new JButton("7");
		btnSiete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string;
				string = textField.getText();
				string+=btnSiete.getText();
				textField.setText(string);
			}
		});
		GridBagConstraints gbc_btnSiete = new GridBagConstraints();
		gbc_btnSiete.insets = new Insets(0, 0, 5, 5);
		gbc_btnSiete.gridx = 0;
		gbc_btnSiete.gridy = 2;
		panel.add(btnSiete, gbc_btnSiete);
		
		JButton btnOcho = new JButton("8");
		btnOcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string;
				string = textField.getText();
				string+=btnOcho.getText();
				textField.setText(string);
			}
		});
		GridBagConstraints gbc_btnOcho = new GridBagConstraints();
		gbc_btnOcho.insets = new Insets(0, 0, 5, 5);
		gbc_btnOcho.gridx = 1;
		gbc_btnOcho.gridy = 2;
		panel.add(btnOcho, gbc_btnOcho);
		
		JButton btnNueve = new JButton("9");
		btnNueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string;
				string = textField.getText();
				string+=btnNueve.getText();
				textField.setText(string);
			}
		});
		GridBagConstraints gbc_btnNueve = new GridBagConstraints();
		gbc_btnNueve.insets = new Insets(0, 0, 5, 5);
		gbc_btnNueve.gridx = 2;
		gbc_btnNueve.gridy = 2;
		panel.add(btnNueve, gbc_btnNueve);
		
		JButton btnBarra = new JButton("/");
		btnBarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String string;
				string = textField.getText();
				string+=btnBarra.getText();
				textField.setText(string);
			}
		});
		GridBagConstraints gbc_btnBarra = new GridBagConstraints();
		gbc_btnBarra.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBarra.gridwidth = 2;
		gbc_btnBarra.insets = new Insets(0, 0, 5, 0);
		gbc_btnBarra.gridx = 3;
		gbc_btnBarra.gridy = 2;
		panel.add(btnBarra, gbc_btnBarra);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.insets = new Insets(0, 0, 5, 5);
		gbc_btnClear.gridx = 0;
		gbc_btnClear.gridy = 3;
		panel.add(btnClear, gbc_btnClear);
		
		JButton btnCero = new JButton("0");
		btnCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string;
				string = textField.getText();
				string+=btnCero.getText();
				textField.setText(string);
			}
		});
		GridBagConstraints gbc_btnCero = new GridBagConstraints();
		gbc_btnCero.insets = new Insets(0, 0, 5, 5);
		gbc_btnCero.gridx = 1;
		gbc_btnCero.gridy = 3;
		panel.add(btnCero, gbc_btnCero);
		
		JButton btnMemoria = new JButton("M");
		btnMemoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnMemoria = new GridBagConstraints();
		gbc_btnMemoria.insets = new Insets(0, 0, 5, 5);
		gbc_btnMemoria.gridx = 2;
		gbc_btnMemoria.gridy = 3;
		panel.add(btnMemoria, gbc_btnMemoria);
		
		JButton btnAsterisco = new JButton("*");
		btnAsterisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnAsterisco = new GridBagConstraints();
		gbc_btnAsterisco.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAsterisco.gridwidth = 2;
		gbc_btnAsterisco.insets = new Insets(0, 0, 5, 0);
		gbc_btnAsterisco.gridx = 3;
		gbc_btnAsterisco.gridy = 3;
		panel.add(btnAsterisco, gbc_btnAsterisco);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnIgual = new GridBagConstraints();
		gbc_btnIgual.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnIgual.gridwidth = 5;
		gbc_btnIgual.gridx = 0;
		gbc_btnIgual.gridy = 4;
		panel.add(btnIgual, gbc_btnIgual);
		contentPane.setLayout(gl_contentPane);
	}
}

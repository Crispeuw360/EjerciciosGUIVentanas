package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class VentanaIdentificate extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextArea texto;
	private JLabel labelTransparente;
	private JButton botonAceptar;

	public VentanaIdentificate() {
		setTitle("Identificate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelNombre.setBounds(28, 59, 64, 23);
		contentPane.add(labelNombre);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContraseña.setBounds(28, 103, 76, 23);
		contentPane.add(lblContraseña);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(145, 105, 149, 21);
		contentPane.add(passwordField);
		
		texto = new JTextArea();
		texto.setBounds(145, 59, 149, 23);
		contentPane.add(texto);
		
		labelTransparente = new JLabel("");
		labelTransparente.setBounds(10, 220, 391, 30);
		contentPane.add(labelTransparente);
		
		botonAceptar = new JButton("Aceptar");
		botonAceptar.setBounds(157, 156, 126, 39);
		contentPane.add(botonAceptar);
		botonAceptar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(botonAceptar))
		{
			if(!passwordField.getPassword().equals("abc"))
			{
				
			}
		}
	}
}

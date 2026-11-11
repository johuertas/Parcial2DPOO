package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import logica.Parcial;

public class FPrincipal extends JFrame implements ActionListener{
	private JLabel lResultado;
	
	private Parcial parcial;
	
	public FPrincipal() {
		
		this.parcial = new Parcial();
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		this.setTitle("Examen José Huertas");
		this.setBounds((int)pantalla.getWidth()/2 - 200, (int)pantalla.getHeight()/2 - 300, 400, 400);
		
		JPanel insertar = new JPanel();
		insertar.setLayout(new GridLayout());
		this.add(insertar, BorderLayout.CENTER);
		
		JLabel labelA = new JLabel("a");
		labelA.setFont(new Font("Arial", Font.BOLD, 60));
		JLabel labelB = new JLabel("b");
		labelB.setFont(new Font("Arial", Font.BOLD, 60));
		JLabel labelC = new JLabel("c");
		labelC.setFont(new Font("Arial", Font.BOLD, 60));

		
		insertar.add(labelA);
		insertar.add(labelB);
		insertar.add(labelC);
		
		this.lResultado = new JLabel("0");
		this.lResultado.setFont(new Font("Arial", Font.BOLD, 60));
		
		JPanel calcular = new JPanel();
		calcular.setLayout(new FlowLayout());
		this.add(calcular, BorderLayout.SOUTH);
		
		
		JButton botonCalcular = new JButton();
		botonCalcular.setFont(new Font("Arial", Font.PLAIN, 20));
		botonCalcular.setText("Calcular");
		botonCalcular.addActionListener(this);
		calcular.add(botonCalcular);
		
		calcular.add(this.lResultado);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FPrincipal();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botonOprimido = (JButton)e.getSource();
		char sim = botonOprimido.getText().chatAt(0);
		if(sim == 'C') {
			try {
				this.Parcial.resultado.cuadratica(Integer.parseInt(this.labelA.getText()), Integer.parseInt(this.labelB.getText()), Integer.parseInt(this.labelC.getText()));
				this.lResultado.setText(getName());
				this.calculadora.setX(true);
			}
			catch (Exception e1) {
				JOptionPane.showMessageDialog(this, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}

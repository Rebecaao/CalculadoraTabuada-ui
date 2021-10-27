package br.senai.sp.jandira.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.CalculadoraTabuada;

public class Tela {
	
public void criarTela() {
		
		//Fontes da minha tela
		//Font fontTitulo = new Font("Arial", Font.PLAIN, 28);
		//Font fontTextoNormal = new Font("Arial", Font.PLAIN, 14);
		//Font fontSubtitulo = new Font("Arial", Font.BOLD, 18);
		//Font fontResultado = new Font("Arial", Font.BOLD, 14);
		
		//Criaçao de cores
		//Color verde = new Color(0, 128, 0);
		//Color azul = new Color(0, 0, 180);
		
		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(600, 600);
		tela.setTitle("Cálculo de IMC");
		tela.setLayout(null); 
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Tabuada");
		//lblTitulo.setFont(fontTitulo);
		//lblTitulo.setForeground(azul);
		lblTitulo.setBounds(20, 0, 120, 40);
		
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(66, 20,100, 40);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(160, 30, 90, 30);
		
		JLabel lblMultiplicador = new JLabel();
		//lblTitulo.setFont(fontTextoNormal);
		lblMultiplicador.setText("Maximo Multiplicador:");
		lblMultiplicador.setBounds(20, 50, 140, 40);
		
		JTextField txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(160, 60, 90, 30);
		
		JLabel lblResultado = new JLabel();
		//lblTitulo.setFont(fontResultado);
		lblResultado.setText("Resultados:");
		lblResultado.setBounds(260, 20, 90, 40);
		
		JTextField txtResultado = new JTextField();
		txtResultado.setBounds(260, 50, 120, 140);
		
		
		
		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(20, 133, 230, 20);
		
		JButton btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setBounds(20, 168, 230, 20);
		
		
		
		//JLabel lblValorIMC = new JLabel();
		//lblValorIMC.setText("Valor IMC: ");
		//lblValorIMC.setBounds(20, 179, 70, 40);
		
		//JLabel lblEstado = new JLabel();
		//lblEstado.setText("Estado IMC: ");
		//lblEstado.setBounds(20, 210, 250, 40);
		
		tela.getContentPane().add(lblTitulo);
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(lblResultado);
		tela.getContentPane().add(txtResultado);
		tela.getContentPane().add(lblMultiplicador);
		tela.getContentPane().add(txtMultiplicador);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(btnLimpar);
		
		
		
		//tela.getContentPane().add(lblValorIMC);
		//tela.getContentPane().add(lblEstado);
		
		tela.setVisible(true);
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				CalculadoraTabuada tabuada = new CalculadoraTabuada();
				//tabuada.setMultiplicando(txtMultiplicando.getText());
				//tabuada.setMultiplicando(txtMultiplicador.getText());
				
				txtResultado.setText(tabuada.tabuadasString());
				
				
				
			}
		});
			
			
		
		
		
	
		
		
		
	}

}

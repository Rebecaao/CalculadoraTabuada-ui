package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.CalculadoraTabuada;

//import br.senai.sp.jandira.ui.Tela;

public class Principal { public static void main(String[] args) 
{
	
	CalculadoraTabuada x = new CalculadoraTabuada();
	CalculadoraTabuada z = new CalculadoraTabuada();
	
	
	x.setMultiplicando(80);
	x.setMultiplicador(45);
	
	z.setMultiplicador(6);
	z.setMultiplicando(5);
	
	String tabuadaX[] = x.calcularTabuada();
	//String tabuadaZ[] = z.calcularTabuada();
	
	for (int i = 0; i <= tabuadaX.length;i++) {
	
	System.out.println(tabuadaX[i]);
	}
	
	
	
}

}

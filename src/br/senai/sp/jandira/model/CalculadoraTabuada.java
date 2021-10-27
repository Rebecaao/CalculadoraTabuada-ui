package br.senai.sp.jandira.model;

public class CalculadoraTabuada {
	
	private int multiplicando, multiplicador;
	
	public void setMultiplicando(int multiplicando) {
		this.multiplicando = multiplicando;
	}
	public int getMultiplicando() {
		return multiplicando;
	}
	
	public void setMultiplicador(int multiplicador) {
		this.multiplicador = multiplicador;
	}
	public int getMultiplicador() {
		return multiplicador;
		
	}
	
	
	public String[] calcularTabuada() {
		String t[] = new String[multiplicador + 1];
		
		for (int i = 0; i <= multiplicador; i++) {
			int produto = multiplicando * i;
			t[i] = multiplicando + "X" + i + "=" + produto;
			
		}
		
		return t;
				
		
	}
	
	public String tabuadasString () {
		return String.valueOf(calcularTabuada());
		
	}
	
	

}

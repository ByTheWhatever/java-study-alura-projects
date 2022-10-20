package br.com.flamengo.bancoFlamengo.classes;

public class ControleBonificacao {

	private double soma;
	
	public void registro(Funcionario f1) {
		double bonifi = f1.getBonificacao();
		this.soma = this.soma + bonifi;
	}
	
	
	public double getSoma() {
		return soma;
	}
	
}

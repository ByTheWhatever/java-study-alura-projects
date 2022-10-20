package br.com.flamengo.bancoFlamengo.classes;

/**
 * 
 * EU DESISTO DA MINHA VIDA
 * @author PICHAU
 *@version 0.1
 *
 */

public class Funcionario2 {

	private String Nome;
	private String Cpf;
	private double Salario;
	private int tipo = 0; // 0 - funcionario 1 // 1 - funcionario 2 // 2 - funcionario 3
	private double Total;
	
	/**
	 * 
	 * EU NAO SEI O QUE FAZER
	 * @return Salario
	 * 
	 */
	
	public double getBonificacao() {
		
		if (this.tipo == 0) 
			return this.Salario * 0.1;
		
		if (this.tipo == 1)
			return this.Salario;
		
		if (this.tipo == 2)
		return this.Salario ++;
		return Salario;
	}
	
	/**
	 * 
	 * PELO AMOR DE DEUS
	 * @param total
	 * 
	 */
	
	public void setTotal(double total) {
		Total = this.Salario + getBonificacao();
		}
	
	public double getTotal() {
		return Total;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	
	public String getCpf() {
		return Cpf;
	}

	public void setCPF(String cpf) {
		Cpf = cpf;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}
		
	
}

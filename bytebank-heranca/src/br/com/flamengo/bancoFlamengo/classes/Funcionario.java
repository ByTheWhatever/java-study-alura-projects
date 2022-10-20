package br.com.flamengo.bancoFlamengo.classes;

/**
 * 
 *Classe de um funcionário 
 * @author PICHAU
 *@since	1999
 *
 */

// classe abstrata não pode ser instanciada
public abstract class Funcionario {

	private String Nome;
	private String Cpf;
	private double Salario;

	/**
	 * 
	 * Método de bonificação
	 * @return
	 * 
	 */
	
// método abstrato não precisa ser implementado no main, mas precisa ser implementado nos herdeiros
	public abstract double getBonificacao();
	

	
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

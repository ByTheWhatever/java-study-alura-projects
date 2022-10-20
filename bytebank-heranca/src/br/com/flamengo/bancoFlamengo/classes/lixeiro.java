package br.com.flamengo.bancoFlamengo.classes;


/**
 * classe que instancia uma profissão
 * @author PICHAU
 *@since 1999
 */

public class lixeiro extends Funcionario implements FuncionarioClasseIntermediaria{

	
	
	public double getBonificacao() {
		return super.getSalario() + 50.0;
		}

	private int senha=666;
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;		
	}

	@Override
	public boolean testeautenticacao(int senha) {
		if (this.senha == senha) {
			return true;
			}	 else {
					return false;
				}
		}
	
	
}

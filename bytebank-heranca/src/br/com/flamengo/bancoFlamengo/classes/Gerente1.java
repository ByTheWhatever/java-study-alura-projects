package br.com.flamengo.bancoFlamengo.classes;

// Extends serve pra puxar a herança de uma classe pra outra, e assina o contrato autenticavel
public class Gerente1 extends Funcionario implements FuncionarioClasseIntermediaria{
	
	public double getBonificacao() {
		return super.getSalario();
		}

	private int senha = 666;
	
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



	
	
	
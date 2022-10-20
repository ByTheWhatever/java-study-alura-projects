package br.com.flamengo.bancoFlamengo.classes;


public abstract interface FuncionarioClasseIntermediaria{
	
	/**
	 * 
	 * interface para setar a senha
	 * @param senha
	 * 
	 */
	
	public abstract void setSenha(int senha); 

	/**
	 * 
	 * boolean que testa se vai dar certo a senha
	 * @param senha
	 * @return
	 * 
	 */
	
	public abstract boolean testeautenticacao(int senha);
	
}



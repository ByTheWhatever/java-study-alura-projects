package br.com.flamengo.bancoFlamengo.classes;

/**
 * 
 * classe cliente que implementa outra classe
 * @author PICHAU
 *
 */


public class Cliente implements FuncionarioClasseIntermediaria {

	private int senha;
	
	/**
	 * 
	 * aqui voce seta uma senha
	 * @param senha
	 * @since 1999
	 * 
	 */
	@Override
	public void setSenha(int senha) {
		this.senha = senha;		
	}

	/**
	 * 
	 * aqui voce teste se a senha tá funfando
	 * @param return
	 * @since 1999
	 * 
	 */
	@Override
	public boolean testeautenticacao(int senha) {
		if (this.senha == senha) {
		return true;
		}	 else {
				return false;
			}
	}

}

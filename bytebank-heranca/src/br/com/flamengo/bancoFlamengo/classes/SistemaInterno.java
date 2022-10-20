package br.com.flamengo.bancoFlamengo.classes;


public class SistemaInterno {

	private int senha;
	
	public void testeautenticacao(FuncionarioClasseIntermediaria fci) {
		boolean autentica = fci.testeautenticacao(this.senha);
		if(autentica) {
			System.out.println("Acesso liberado.");
		} else {
			System.out.println("Acesso negado.");
		}
	}
 }

package br.com.flamengo.bancoFlamengo.testes;

import br.com.flamengo.bancoFlamengo.classes.*;

public class TesteSenha {

	public static void main(String[] args) {
		
		SistemaInterno seloco = new SistemaInterno();
		
		Gerente1 biscoito = new Gerente1();
		biscoito.setSenha(666);
		
		lixeiro pamonha = new lixeiro();
		pamonha.setSenha(777);
	
		seloco.testeautenticacao(biscoito);
		seloco.testeautenticacao(pamonha);
	}
	
}

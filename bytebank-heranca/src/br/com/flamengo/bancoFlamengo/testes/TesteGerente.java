package br.com.flamengo.bancoFlamengo.testes;

import br.com.flamengo.bancoFlamengo.classes.*;

/**
 * @author PICHAU
 *
 */
public class TesteGerente {

	public static void main(String[] args) {
	
		Gerente1 filipe = new Gerente1();
		filipe.setNome("Filipe");
		filipe.setCPF("123.456.789");
		filipe.setSalario(5000);
//		filipe.setSenha(2222);
//		
//		boolean autenticacao = filipe.testeautenticacao(2222);
		
		System.out.println(filipe.getNome());
		System.out.println(filipe.getCpf());
		System.out.println(filipe.getSalario());
//		System.out.println(autenticacao);
		System.out.println(filipe.getBonificacao());
	}

}

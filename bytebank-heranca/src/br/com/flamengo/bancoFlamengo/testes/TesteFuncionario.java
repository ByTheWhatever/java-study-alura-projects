package br.com.flamengo.bancoFlamengo.testes;

import br.com.flamengo.bancoFlamengo.classes.*;

public class TesteFuncionario {

	
	public static void main(String[] args) {
		
		Funcionario gabriel = new lixeiro();
		gabriel.setNome("Gabriel");
		gabriel.setCPF("123.456.789");
		gabriel.setSalario(2800);
		
		
		System.out.println(gabriel.getNome());
		System.out.println(gabriel.getBonificacao());

	}

}

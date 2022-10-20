package br.com.flamengo.bancoFlamengo.testes;

import br.com.flamengo.bancoFlamengo.classes.*;

public class TesteFuncionario2 {

	public static void main(String[] args) {
	
		Funcionario2 sofhia = new Funcionario2();
		sofhia.setNome("Sofhia");
		sofhia.setCPF("123.456");
		sofhia.setSalario(3000.0);
		sofhia.setTipo(2);

		System.out.println(sofhia.getSalario());
	}

}

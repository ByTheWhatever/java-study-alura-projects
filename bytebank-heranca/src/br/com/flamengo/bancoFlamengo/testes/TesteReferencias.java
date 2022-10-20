package br.com.flamengo.bancoFlamengo.testes;

import br.com.flamengo.bancoFlamengo.classes.*;

public class TesteReferencias {

	public static void main(String[] args) {
		
		    Gerente1 teste1 = new Gerente1();
			teste1.setNome("Rogerio");
			teste1.setSalario(3000.0);
			
			lixeiro everton = new lixeiro();
			everton.setNome("everton");
			everton.setSalario(500.0);
			
			ControleBonificacao testecontrole = new ControleBonificacao();
			testecontrole.registro(teste1);
			testecontrole.registro(everton);
			
			
			System.out.println(testecontrole.getSoma());
	}

}

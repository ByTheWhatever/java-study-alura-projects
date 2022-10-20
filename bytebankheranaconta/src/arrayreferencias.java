
public class arrayreferencias {

	
	public static void main(String[] args) {

		Conta[] contas = new Conta[5];
		
		ContaCorrente conta1 = new ContaCorrente(01, 02);
		conta1.setTitular("poliglota");
		contas[0] = conta1;
		conta1.setsaldo(200.0);
		System.out.println(contas[0].getTitular());
		System.out.println(contas[0].getSaldo());
	}

}

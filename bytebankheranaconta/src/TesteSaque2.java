public class TesteSaque2 {

	public static void main(String[] args) {

		
		ContaCorrente Chaves = new ContaCorrente(111,222);
		Chaves.deposita(200.0);

		ContaPoupanca Macaco = new ContaPoupanca(222,333);
		Macaco.deposita(200.0);
		
		Chaves.transfere(50.0, Macaco);
		
		System.out.println(Macaco.getSaldo());
		System.out.println(Chaves.getSaldo());
	}

}

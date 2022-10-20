public class TesteSaque {

	public static void main(String[] args) {

		
		ContaCorrente Chaves = new ContaCorrente(111,222);
	
		Chaves.deposita(200.0);
			
		Chaves.saca(199.8);
	
		System.out.println(Chaves.getSaldo());
		
	}	

}


public class TesteReferencias {

		public static void main(String[] args) {
			Conta primeiraConta = new Conta();
			primeiraConta.saldo = 200;
			
			Conta segundaConta = primeiraConta;
			
			segundaConta.saldo += +200;
			
			System.out.println("saldo da primeira conta é: " + segundaConta.saldo);
			
		}
		
		
		
}

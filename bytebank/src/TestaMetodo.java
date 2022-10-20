
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaTeste = new Conta();
			contaTeste.saldo = 200;
			contaTeste.deposita(450);
			System.out.println("valor total da conta é: " + contaTeste.saldo);
			
			contaTeste.saca(150);
			System.out.println("valor atual da conta é " + contaTeste.saldo);
		
		Conta contaTeste2 = new Conta();
			contaTeste2.saldo = 1500;
			contaTeste2.transfere(550, contaTeste);
			System.out.println("saldo atual conta é: " + contaTeste.saldo);		
			System.out.println("saldo atual conta 2 é: " + contaTeste2.saldo);
			boolean deuCerto = contaTeste2.transfere(0, contaTeste);
			System.out.println(deuCerto);
}
}
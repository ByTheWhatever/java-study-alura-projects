
public class Criaconta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("a primeira conta tem: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 100;
		System.out.println("a segunda conta tem: " + segundaConta.saldo);
	}

}

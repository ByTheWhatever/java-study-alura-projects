
public class testebanco {

		public static void main(String [] args) {
			
			clienteteste paulo = new clienteteste();
			paulo.nome = "Paulo";
			paulo.cpf = "666.666.666-66";
			paulo.profissao = "lixeiro";
			
			Conta contaDoPaulo = new Conta ();
			contaDoPaulo.saldo = (100);
						
			contaDoPaulo.titular = paulo;
			
			System.out.println(contaDoPaulo.titular.nome);
			System.out.println(contaDoPaulo.saldo);
		}
}

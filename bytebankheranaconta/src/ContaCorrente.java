
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) {
		double valorASersacado = valor + 0.2;
		super.saca(valorASersacado);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;	
	}
	
}

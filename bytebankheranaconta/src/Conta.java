
public abstract class Conta {

	    protected double saldo;
	    private int agencia;
	    private int numero;
	    private String titular;
	    private static int total = 0;

	    public Conta(int agencia, int numero){
	        Conta.total++;
	        this.agencia = agencia;
	        this.numero = numero;
	        this.saldo = 0;
	    }

	    public abstract void deposita(double valor);

	    public void saca(double valor) {
	        if(this.saldo < valor) {
	            throw new ExcecaoSaldo("Saldo insuficiente");
	        }
	        
	        this.saldo -= valor;
	        
	    }

	    public void transfere(double valor, Conta destino) {
	        this.saca(valor);
	        destino.deposita(valor);
	    }

	    public double getSaldo(){
	        return this.saldo;
	    }
	    
	    public void setsaldo(double saldo){
	        this.saldo = saldo;
	    }

	    public int getNumero(){
	        return this.numero;
	    }

	    public void setNumero(int numero){
	        if(numero <= 0) {
	            System.out.println("Nao pode valor menor igual a 0");
	            return;
	        }
	        this.numero = numero;
	    }

	    public int getAgencia(){
	        return this.agencia;
	    }

	    public void setAgencia(int agencia){
	       if(agencia <= 0) {
	           System.out.println("Nao pode valor menor igual a 0");
	           return;
	       }
	       this.agencia = agencia;
	    }

	    public void setTitular(String titular){
	        this.titular = titular;
	    }

	    public String getTitular(){
	        return this.titular;
	    }

	    public static int getTotal(){
	        return Conta.total;
	    }

	}


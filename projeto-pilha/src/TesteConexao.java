
public class TesteConexao {
	
	public static void main(String[] args) {
	    Finally con = null;
	    try {
	        con = new Finally();
	        con.leDados();
	    } catch(IllegalStateException ex) {
	        System.out.println("Deu erro na conexao");
	    } finally {
	        con.fecha();
	    }
	}
}

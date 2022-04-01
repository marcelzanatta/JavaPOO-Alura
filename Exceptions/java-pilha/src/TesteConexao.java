
public class TesteConexao {
	public static void main(String[] args) {
		
		Conexao conexao = null;
		try {
			conexao = new Conexao();
			conexao.leDados();
			conexao.fecha();
		}catch(Exception ex) {
			System.out.println("Deu erro da conexao " + ex.getMessage());			
		}finally {
			conexao.fecha();
		}
	}
}


public class AutenticacaoUtil {

	private int senha = 2222;
	

	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Autenticou");
			return true;
		}
		System.out.println("Não Autenticou");
		return false;
	}
	
}

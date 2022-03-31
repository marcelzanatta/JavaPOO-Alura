

public class CadastraConta {
	
	public static void main(String[] args) {

		Cliente primeiroClinte = new Cliente();
		primeiroClinte.nome = "Jorge";
		primeiroClinte.cpf = "020.555.555.66";
		primeiroClinte.profissao = "Pintor";
		
		Conta primeiraConta = new Conta();		
		primeiraConta.titular = primeiroClinte;
		
		System.out.println("Nome Primeiro Cliente: " + primeiraConta.titular.nome);
		
		
	}

}

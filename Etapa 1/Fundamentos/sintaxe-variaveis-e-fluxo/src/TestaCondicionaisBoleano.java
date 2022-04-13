
public class TestaCondicionaisBoleano {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 16; 
		int qtdPessoas = 3;
		boolean status = true;
		
		System.out.println("status: " + status);
		
		if (( idade >= 18 || qtdPessoas > 2) && ( status == true)) {
			System.out.println("Pode entrar na festa");
		}else {
			System.out.println("Not meet requirements");
		}
	}

}

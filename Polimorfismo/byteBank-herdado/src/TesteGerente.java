
public class TesteGerente {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Marcel");
		gerente.setSalario(5000);
		gerente.setCpf("555.666.444.77");
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		

		boolean autenticou = gerente.autentica(2223);
		
		System.out.println(autenticou);
		
		System.out.println(gerente.getBonificacao());
		
		
	}
}

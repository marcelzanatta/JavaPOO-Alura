
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(8047,05744);
		
		System.out.println(conta.getNumero());
		conta.setNumero(002);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setCpf("222.222.222.55");
		paulo.setNome("Paulo Silveira");
		paulo.setProfissao("Programador");
		
		conta.setTitular(paulo);
		
		System.out.println("Nome Cliente: " + conta.getTitular().getNome());
		conta.getTitular().setCpf("222.22.22.55");
		
		System.out.println("CPF Cliente: " + conta.getTitular().getCpf());
		
		Conta conta2 = new Conta(8047,05744);
		
		System.out.println("Numero de Contas Criadas: " + Conta.getCount());
	}
}

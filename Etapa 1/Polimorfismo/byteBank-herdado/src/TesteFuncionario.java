
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		
		nico.setNome("Marcel");
		nico.setSalario(7500);
		nico.setCpf("350.55.555.55");
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		System.out.println(nico.getSalario());
		
				
	}
}

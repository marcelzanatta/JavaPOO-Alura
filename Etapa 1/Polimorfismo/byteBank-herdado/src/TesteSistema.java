
public class TesteSistema {

		public static void main(String[] args) {
			
			Gerente gerente = new Gerente();
			gerente.setSenha(2222);
			
			Administrador adm = new Administrador();
			adm.setSenha(2223);
			
			Cliente cliente = new Cliente();
			System.out.println(cliente.autentica(2222));
			
			Cliente cliente2 = new Cliente();
			cliente2.setSenha(2222);

			
			
			SistemaInterno si = new SistemaInterno();
			si.autentica(gerente);
			si.autentica(adm);
			si.autentica(cliente2);
			


		}
}

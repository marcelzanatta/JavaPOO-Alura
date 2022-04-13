
public class TesteReferencias {
	public static void main(String[] args) {
		
		
		Gerente gerente = new Gerente();
		gerente.setNome("Marccos");
		gerente.setSalario(5000.0);
				
		EditorVideo editor = new EditorVideo();
		editor.setSalario(2500.0);
		
		Designer designer = new Designer();
		editor.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(editor);
		controle.registra(designer);
		
		System.out.println(controle.getSoma());
		
	}

}

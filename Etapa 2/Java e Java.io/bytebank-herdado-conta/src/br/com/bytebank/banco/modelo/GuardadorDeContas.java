package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Object[] referencias;
	private int posLivreVetor;
	
	public GuardadorDeContas() {
		this.referencias = new Object[10];
		this.posLivreVetor = 0;
	}
	
	public void adiciona(Object referencia) {

		this.referencias[this.posLivreVetor] = referencia;
		this.posLivreVetor++;

	}
	
	public int getQuantidadeDeElementos(){
		
		return this.posLivreVetor ;
		
	}

	public Object getReferencia(int i) {
		return this.referencias[i];
	}

}

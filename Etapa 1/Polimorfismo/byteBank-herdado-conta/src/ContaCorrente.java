
public class ContaCorrente extends Conta implements Tributavel {

	private double taxa = 0.05;
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero);
	} 
	
	@Override
	public boolean saca(double valor){
		
		double valorASacar = valor + 0.2;
		
		return super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		
		return super.getSaldo() * this.taxa;	
		
	}
}

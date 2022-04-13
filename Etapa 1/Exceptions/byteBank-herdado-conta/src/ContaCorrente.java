
public class ContaCorrente extends Conta implements Tributavel {

	private double taxa = 0.05;
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero);
	} 
	
	@Override
	public void saca(double valor) throws ExceptionSaldoInsuficiente{
		
		double valorASacar = valor + 0.2;	
		super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		
		return super.getSaldo() * this.taxa;	
		
	}
}

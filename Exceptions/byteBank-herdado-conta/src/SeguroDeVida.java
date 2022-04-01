
public class SeguroDeVida implements Tributavel {

	private double taxa = 0.1;
	private double valorSeguro = 150000.0;
	
	@Override
	public double getValorImposto() {
		
		return valorSeguro * this.taxa;	
	}

}

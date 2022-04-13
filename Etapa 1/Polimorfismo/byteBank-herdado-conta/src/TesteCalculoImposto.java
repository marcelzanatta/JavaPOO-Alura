
public class TesteCalculoImposto {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(8047,05477);
		cc.deposita(1000);
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Imposto CC: " + cc.getValorImposto());	
		
		SeguroDeVida segVida = new SeguroDeVida();	
		System.out.println("Imposto Seguro de Vida: " + segVida.getValorImposto());
		
		CalculadorImposto calc = new CalculadorImposto();
						
		System.out.println("----------------------");
			
		System.out.println(calc.Calculando(segVida));
		System.out.println(calc.Calculando(cc));
		
	}
}

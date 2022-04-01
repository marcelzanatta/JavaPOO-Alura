
public class TesteContas {

	public static void main(String[] args) throws ExceptionSaldoInsuficiente {
		 
		ContaCorrente cc = new ContaCorrente( 111, 52);		
		cc.deposita(100.0);
		
		ContaPoupanca cpp = new ContaPoupanca(80, 42);
		cpp.deposita(200);

		cc.transfere(20, cpp);
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CPP: " + cpp.getSaldo());
	}

}

/*
public class TesteSacaPosException  {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1225,88);
		
		conta.deposita(500);
		try {
			conta.saca(550);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println(conta.getSaldo());
	}
}

*/


public class TesteSacaPosException  {
	public static void main(String[] args) throws ExceptionSaldoInsuficiente{
		Conta conta = new ContaCorrente(1225,88);
		
			conta.deposita(500);
			conta.saca(550);
		System.out.println(conta.getSaldo());
	}
}

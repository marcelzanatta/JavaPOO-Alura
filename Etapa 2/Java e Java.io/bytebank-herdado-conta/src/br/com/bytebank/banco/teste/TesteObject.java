package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteObject {

	public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println('x');
//		System.out.println(false);
		
		
		Object cliente = new Cliente();
		ContaCorrente cc = new ContaCorrente(22,23);
		ContaPoupanca cp = new ContaPoupanca(33,44);

		System.out.println(cc);
		System.out.println(cp);
		System.out.println(cliente);
		//println(cliente);
	}

	private static void println(Object referencia ) {
		// TODO Auto-generated method stub
		
	}

}

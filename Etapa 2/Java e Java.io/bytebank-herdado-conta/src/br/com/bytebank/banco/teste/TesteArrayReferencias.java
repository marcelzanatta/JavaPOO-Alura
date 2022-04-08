package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {

		public static void main(String[] args) {
			
			Object[] contas = new Object[5];
			
			ContaCorrente cc1 = new ContaCorrente(22, 11);		
			ContaCorrente cc2 = new ContaCorrente(34, 18);	
			Cliente cliente = new Cliente();
			
			contas[0] = cc1;
			contas[1] = cc2;
			contas[2] = cliente;
			
//			ContaCorrente ref = contas[1];
//			
//			System.out.println( contas[0].getNumero() );
//			System.out.println( contas[1].getNumero() );
//			System.out.println( contas[2].getNome );
			


		}
}

package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteGuardadorContas {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc1 = new ContaCorrente(8047, 4444);
		guardador.adiciona(cc1);

		
		Conta cc2 = new ContaCorrente(8047, 4455);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println("Tamanho vetor: " + tamanho);
		
		Conta ref = (Conta)guardador.getReferencia(1);
		
		System.out.println(ref.getNumero());

	}
}
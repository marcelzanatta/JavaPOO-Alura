package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(8047, 4444);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(8047, 4455);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(8047, 4455);
		boolean existe = lista.contains(cc3);
		
		System.out.println("método contains: " + existe);

		for ( Conta conta : lista) {
			System.out.println(conta);
		}
		

	}

}

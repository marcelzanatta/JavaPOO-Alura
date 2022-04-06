package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(8047, 4444);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(8047, 4455);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(8047, 4466);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(8047, 4477);
		lista.add(cc4);
			
		System.out.println("Tamanho " + lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		
		lista.remove(0);
		System.out.println("Tamanho " + lista.size());
		

		 // Para cada elemento do tipo Object da 'lista' faça
		for ( Conta oRef : lista) {
			System.out.println(oRef);
		}
		

	}

}

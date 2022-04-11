package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula( "Mais Revisando os ArraysLists", 21);
		Aula a2 = new Aula("Lista de Objetos", 15);
		Aula a3 = new Aula("Relacinamento de lista de Objetos", 15);

		ArrayList<Aula> aula = new ArrayList<Aula>();
		
		aula.add(a1);
		aula.add(a2);
		aula.add(a3);
		
		System.out.println(aula);
			
		System.out.println("---------------");
		
		aula.sort((c1, c2) -> Integer.compare(c1.getTempo(), c2.getTempo()) );
		aula.forEach( (Aula ) -> System.out.println(Aula));
		
		System.out.println("---------------");
		
		Collections.sort(aula, Comparator.comparing(Aula::getTempo));
		aula.forEach( (Aula ) -> System.out.println(Aula));
		
		System.out.println("---------------");
		
		aula.sort(Comparator.comparing(Aula::getTitulo));
		aula.forEach( (Aula ) -> System.out.println(Aula));
		
		
		

	}

}

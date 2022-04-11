package br.com.alura;

import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Collections", "Marcel Zanatta");		
			
		javaColecoes.getAulas().add(new Aula("Teste Aula", 45));
		javaColecoes.adciona(new Aula("Teste Aula", 45));

//		aulas.add(new Aula("Trabahandondo com arraylist",21));
//		aulas.add(new Aula("Lista de Objetos", 15));
//		aulas.add(new Aula("Relacinamento de lista de Objetos", 15));
		
		System.out.println(javaColecoes.getAulas());
		
		
		
	}

}

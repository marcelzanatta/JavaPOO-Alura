package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Collections", "Marcel Zanatta");		
			
		javaColecoes.adciona(new Aula("Teste Aula 3", 65));
		javaColecoes.adciona(new Aula("Teste Aula 1", 30));
		javaColecoes.adciona(new Aula("Teste Aula 3", 45));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		List<Aula> aulaMutaveis = new ArrayList<>(aulasImutaveis);
	
		Collections.sort(aulaMutaveis);
		
		System.out.println(aulaMutaveis);

		

		
		
		
	}

}

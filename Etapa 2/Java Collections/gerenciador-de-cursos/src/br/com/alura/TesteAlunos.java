package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteAlunos {
	
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add(" 1 - Marcel Zanatta");
		alunos.add(" 2 - Marcel Zanatta");
		alunos.add(" 3 - Marcel Zanatta");
		alunos.add(" 4 - Marcel Zanatta");
		alunos.add(" 5 - Marcel Zanatta");
		alunos.add(" 6 - Marcel Zanatta");
		
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			
			System.out.println(aluno);
		}
		
		System.out.println("-----------------");
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		boolean contem = alunos.contains(" 2 - Marcel Zanatta");
		
		System.out.println(contem);
		System.out.println("-----------------");
		List<String> alunosLista = new ArrayList<>(alunos);
		
		Collections.sort(alunosLista);
		
		alunosLista.forEach( aluno -> {
			System.out.println(aluno);
		});
		
		
	}

}

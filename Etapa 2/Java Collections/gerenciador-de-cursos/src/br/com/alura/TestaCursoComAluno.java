package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

		public static void main(String[] args) {
			
			Curso javaColecoes = new Curso("Collections", "Paulo T");		
			
			javaColecoes.adciona(new Aula("TRabalahndo com Set", 45));
			javaColecoes.adciona(new Aula("TRabalahndo com ArrayLis", 35));
			
			Aluno a1 = new Aluno("Marcel", 5547);
			Aluno a2 = new Aluno("Tiago", 3341);
			Aluno a3 = new Aluno("Carlos", 5575);
			Aluno a4 = new Aluno("Carlos", 5575);
			
						
			javaColecoes.matriculaAluno(a1);
			javaColecoes.matriculaAluno(a2);
			javaColecoes.matriculaAluno(a3);
			
			System.out.println("Todos os alunos matriculados");
			
			System.out.println();
			
			Set<Aluno> alunos = javaColecoes.getAlunos();
			Iterator<Aluno> iterator = alunos.iterator();
			
			while(iterator.hasNext()) {
				Aluno proximo = iterator.next();
				System.out.println(proximo);
			}
			
//			javaColecoes.getAlunos().forEach(aluno -> {
//				System.out.println(aluno);
//			});
//			
//			System.out.println("----------------");
//			System.out.println(javaColecoes.estaMatriculado(a1));
//			
//			System.out.println("----------------");
//			
//			Aluno marcel = new Aluno("Marcel", 5547);
//			System.out.println("E esse Marce, está matriculado?");
//			System.out.println(javaColecoes.estaMatriculado(marcel));
			
			
		}
}

package br.com.alura;

public class TestaBuscaAlunoNoCurso {
	
	public static void main(String[] args) {
		
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matriculaAluno(a1);
        javaColecoes.matriculaAluno(a2);
        javaColecoes.matriculaAluno(a3);
        
        System.out.println("Buscando aluno matricula 5617");
        Aluno aluno = javaColecoes.buscaMatriculado(5617);
        
        System.out.println(aluno);
        
	}

}

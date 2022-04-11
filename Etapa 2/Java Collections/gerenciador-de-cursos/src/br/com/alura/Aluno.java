package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
	    if (nome == null) {
	        throw new NullPointerException("Nome n�o pode ser nulo");
	    }
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
	    Aluno outroAluno = (Aluno) obj;
	    return this.nome.equals(outroAluno.nome);
	}
	
	@Override
	public int hashCode(){
	    return this.nome.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aluno: " + this.getNome() + " Matricula: " + this.getNumeroMatricula();
	}

}
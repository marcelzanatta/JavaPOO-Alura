import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAlunos() {
		return alunos;
	}
/*	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ Quantidade Aluno: " + this.getAlunos() + "]";
	}
*/	
	
}


public class ExemploCursos{
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		// Ordenando pela quantidade de alunos
		cursos.sort(Comparator.comparing( c-> c.getAlunos()));		
		cursos.sort(Comparator.comparing(Curso::getAlunos));	
		
		// Duas formas de impressão
		cursos.forEach(System.out::println);
		cursos.forEach( c -> System.out.println(c.getAlunos()));

		cursos.stream()
			.filter( c-> c.getAlunos() >= 100)
		//	.forEach(c -> System.out.println(c.getNome()));
			.forEach(System.out::println);
		
		cursos.stream()
		.filter( c-> c.getAlunos() >= 100)
		.map(c -> c.getAlunos())			// devolve uma steam de integer 
		.forEach(qtd -> System.out.println(qtd));
		
		cursos.stream()
		.filter( c-> c.getAlunos() >= 100)
		.map(Curso::getAlunos)			// devolve uma steam de integer 
		.forEach(System.out::println);
		
		int sum = cursos.stream()
		.filter( c-> c.getAlunos() >= 100)
		.mapToInt(Curso::getAlunos)	
		.sum();
		
		System.out.println(sum);
		
		System.out.println("-----------------------");
		cursos.stream()
			.filter( c-> c.getAlunos() >= 50)
			.forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("-----------------------");
		

		
		OptionalDouble average = cursos.stream()
		.filter( c-> c.getAlunos() >= 100)
		.mapToInt(Curso::getAlunos)	
		.average();
		
		System.out.println(average);
		
		cursos.stream()
		.filter( c -> c.getAlunos()>=100)
		.findAny()
		.ifPresent(c -> System.out.println(c.getNome()));
		
		List<Curso> collect = cursos.stream()
		.filter( c -> c.getAlunos()>=100)
		.collect(Collectors.toList());
		
		System.out.println("----------------");
		
		collect.stream()
			.filter( c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(
					c -> c.getNome(), 
					c -> c.getAlunos()))
			.forEach((nome,quantidade) -> System.out.println(nome + " tem " + quantidade + " alunos"));
		
		System.out.println("----------------");
		
		cursos.stream()
		.mapToInt(Curso::getAlunos)	
		.average();
		
		Stream<Curso> stream = cursos.stream()
				   .filter(c -> c.getAlunos() > 50);
		
		
		List<Curso> lista = cursos.stream()
				.collect(Collectors.toList());

		
		
		
		
	}
}

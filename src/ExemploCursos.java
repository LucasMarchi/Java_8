import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Curso {
	
    private String nome;
    private int numeroDenumeroDeAlunos;

    public Curso(String nome, int numeroDealunos) {
        this.nome = nome;
        this.numeroDenumeroDeAlunos = numeroDealunos;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDeAlunos() {
        return numeroDenumeroDeAlunos;
    }
}

public class ExemploCursos {
	
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//Ordenando pela quantidade de alunos usando method reference
		cursos.sort(Comparator.comparing(Curso::getNumeroDeAlunos));
		
		//Usando stream para filtrar por quantidade de alunos e printar na tela
		cursos.stream()
			.filter(curso -> curso.getNumeroDeAlunos() > 100)
			.map(Curso::getNome)
			.forEach(System.out::println);
		
		//Usando stream para filtrar por quantidade de alunos e somar
		int soma = cursos.stream()
			.filter(curso -> curso.getNumeroDeAlunos() > 100)
			.mapToInt(Curso::getNumeroDeAlunos)
			.sum();
		
		System.out.println(soma);
		
		//Usando stream para filtrar por quantidade de alunos, pegar o primeiro e caso ele exista pritar na tela
		cursos.stream()
		   .filter(c -> c.getNumeroDeAlunos() > 50)
		   .findFirst()
		   .ifPresent(curso -> System.out.println(curso.getNome()));
		
		//Usando stream para calcular a media de alunos por curso e caso não tenha problemas com a media printa na tela
		cursos.stream()
			.mapToInt(curso -> curso.getNumeroDeAlunos())
			.average()
			.ifPresent(System.out::println);
		
		//Usando stream para filtrar por quantidade de alunos converter para um map e iterar sobre o mesmo
		cursos.stream()
				.filter(curso -> curso.getNumeroDeAlunos() > 50)
				.collect(Collectors.toMap(Curso::getNome, Curso::getNumeroDeAlunos))
				.forEach((nome, numeroDeAlunos) -> System.out.println(nome + " " + numeroDeAlunos));
		
		

		
	}

}

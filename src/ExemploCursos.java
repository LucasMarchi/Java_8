import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Curso {
    private String nome;
    private int numeroDenumeroDealunos;

    public Curso(String nome, int numeroDealunos) {
        this.nome = nome;
        this.numeroDenumeroDealunos = numeroDealunos;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDealunos() {
        return numeroDenumeroDealunos;
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
		cursos.sort(Comparator.comparing(Curso::getNumeroDealunos));
		
		//Usando stream para filtrar por quantidade de alunos e printar na tela
		cursos.stream()
			.filter(curso -> curso.getNumeroDealunos() > 100)
			.map(Curso::getNome)
			.forEach(System.out::println);
		
		//Usando stream para filtrar por quantidade de alunos e somar
		int soma = cursos.stream()
			.filter(curso -> curso.getNumeroDealunos() > 100)
			.mapToInt(Curso::getNumeroDealunos)
			.sum();
		
		System.out.println(soma);
		
	}

}

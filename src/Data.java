import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {
	
	public static void main(String[] args) {
		
		//Criando formatador
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//Usadndo um dos recursos da nova api de datas
		LocalDate hoje = LocalDate.now();
		System.out.println(formatador.format(hoje));
		
		LocalDate dataAleatoria = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(dataAleatoria);
		
		//Utilizando Periodo e acrescentando um ano(between utiliza padrao(includente, excludente)
		Period periodo = Period.between(hoje, dataAleatoria.plusYears(1));
		System.out.println(periodo.getYears());
		
	}
	
}

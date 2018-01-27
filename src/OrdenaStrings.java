import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("aaa");
		palavras.add("bb");
		palavras.add("c");

		//Forma de usar sort com lambda
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		//Sort usando method reference
		palavras.sort(Comparator.comparing(String::length));
		
		//Forma nova de interar com lambda
		palavras.forEach(s -> System.out.println(s));
		
		//ForEach usando method reference
		palavras.forEach(System.out::println);
		
		//Executando Runnable em uma Thread com lambda 
		new Thread(() -> System.out.println("Executando um Runnable")).start();
	
	}
	
}

import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("aaa");
		palavras.add("bb");
		palavras.add("c");

		//Forma de usar sort com lambda
		palavras.sort((s1, s2) -> s1.length() - s2.length());
		
		//Forma nova de interar com lambda
		palavras.forEach(s -> System.out.println(s));
		
		//Executando Runnable em uma Thread com lambda 
		new Thread(() -> System.out.println("Executando um Runnable")).start();
	
	}
	
}

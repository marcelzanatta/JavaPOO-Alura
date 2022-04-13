import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {
	
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Alura");
		palavras.add("Marcel");
		palavras.add("Bola");
		
		
		Collections.sort(palavras);		
		System.out.println(palavras);
		
		
		System.out.println("---------------");
		
				
//		palavras.sort((String s1, String s2) -> {
//		        if(s1.length() < s2.length()) 
//		            return -1;
//		        if(s1.length() > s2.length()) 
//		            return 1;
//		        return 0;
//		});
		
		palavras.sort((String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println(palavras);
		
		Consumer<String> consumidor = new ConsumidorDeString();
		
		
		palavras.forEach(consumidor);

	}

}

class ConsumidorDeString implements Consumer<String> {
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorDeStringPorTamanho implements Comparator<String> {
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()) 
            return -1;
        if(s1.length() > s2.length()) 
            return 1;
        return 0;
    }
}
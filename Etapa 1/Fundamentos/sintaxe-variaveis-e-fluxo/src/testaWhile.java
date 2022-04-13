
public class testaWhile {
	public static void main(String[] args) {
		int count = 0;
		
		System.out.println("While");
		while( count < 10 ) {
			System.out.println(count);
			count++;
		}
		
		System.out.println("For");
		
		for ( int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		System.out.println("Fatorial");
		
		int numero = 6;
		
		int resultado = 1;
		
		for ( int i = 1; i<=numero; i++) {
			 
			resultado = resultado * i ;
		}
		
		System.out.println(resultado);
		
	}

}

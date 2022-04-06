package br.com.bytebank.banco.teste.util;

public class TesteWrapper {

	public static void main(String[] args) {
		
		
		// INTEGER
		String idade = "29";
		
		Integer idade2 = Integer.valueOf(29);
		
		int numero = Integer.parseInt(idade);
		double numeroDouble = idade2.doubleValue();
		numero ++;
		
		System.out.println(numero);
		System.out.println(numeroDouble);
		
		Integer ref = Integer.valueOf(3);
	    ref++;
	    System.out.println(ref);
	    
	    // Double
	    Integer idadeRef = Integer.valueOf(29);
	    System.out.println(idadeRef.intValue());
	    
	    Double dRef = Double.valueOf(3.2);
	    // Double dRef = 3.2;
	    
	    boolean bRef = Boolean.valueOf(false);
	    // boolean bRef = false;

	}
}

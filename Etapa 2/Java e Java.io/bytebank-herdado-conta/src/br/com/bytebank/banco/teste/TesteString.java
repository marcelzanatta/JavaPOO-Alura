package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Marcel";
		
		String nomeNovo = nome.replace('a', 'A');	// Subistitui a letra do primeiro parâmetro pela letra do segundo parâmetro
		String nomeNovo2 = nome.toLowerCase();
		String nomeNovo3 = nome.toUpperCase();		
		
		System.out.println(nome.charAt(2));		// Devolve o caracter que está na posição passada por parâmetro
		
		System.out.println(nome.indexOf('a'));   // Devolve posição da string
		System.out.println(nome.indexOf("el"));   // Devolve posição da string
		
		System.out.println(nome.substring(1)); // devolve uma substring a partir do indice 1 
		
		System.out.println(nome.length()); // retorna a qtd de carcteres que a String tem
		
		for ( int i = 0 ; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String vazio = " "; 
		
		String vazio2 = vazio.trim(); // Remove os espaços tanto da direita como da esquerda 
		
		String sobrenome = "Zanatta";
		System.out.println("resultado"+ sobrenome.contains("nat"));
		
		System.out.println(vazio2.isEmpty());  // retorna true ou false
		
		
		
		System.out.println(nomeNovo);
		System.out.println(nomeNovo2);
		System.out.println(nomeNovo3);
	}

}

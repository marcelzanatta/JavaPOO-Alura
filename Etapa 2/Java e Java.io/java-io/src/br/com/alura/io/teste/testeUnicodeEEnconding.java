package br.com.alura.io.teste;

import java.nio.charset.Charset;

public class testeUnicodeEEnconding {

	public static void main(String[] args) {

		String s = "ç";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();		
		System.out.println(charset.displayName());
		
		
		

	}

}

package br.com.alura.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteReader {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de Entrada com Arquivo		
		InputStream fis = new FileInputStream("lorem.txt");	
		Reader isr = new InputStreamReader(fis);
		BufferedReader bR = new BufferedReader(isr);
		
		String linha = bR.readLine();
		
		while ( linha != null) {
			System.out.println(linha);
			linha = bR.readLine();
		}
	
		bR.close();
	}

}

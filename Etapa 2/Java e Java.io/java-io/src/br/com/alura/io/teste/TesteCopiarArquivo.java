package br.com.alura.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de Entrada com Arquivo		
		InputStream fis = System.in;								//InputStream fis = new FileInputStream("lorem.txt");	
		Reader isr = new InputStreamReader(fis);
		BufferedReader bR = new BufferedReader(isr);
		
		// Fluxo de Saída com Arquivo	
		OutputStream fOs = System.out;		//OutputStream fOs = new FileOutputStream("lorem3.txt");
		Writer osW = new OutputStreamWriter(fOs);
		BufferedWriter bW = new BufferedWriter(osW);
		
		String linha = bR.readLine();	
		
		while ( linha != null && !linha.isEmpty()) {
			bW.write(linha);
			bW.newLine();
			bW.flush();
			linha = bR.readLine();			
		}
	
		bR.close();
		bW.close();
	}

}

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

public class TesteWriter {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de Saída com Arquivo	
		OutputStream fOs = new FileOutputStream("lorem2.txt");
		Writer osW = new OutputStreamWriter(fOs);
		BufferedWriter bW = new BufferedWriter(osW);
		
		bW.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bW.newLine();
		bW.newLine();
		bW.write("Testando Output Stream");
	
		bW.close();

	}

}

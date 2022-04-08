package br.com.alura.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteFileWriter {

	public static void main(String[] args) throws IOException {
					
		FileWriter fW = new FileWriter("lorem5.txt");
		BufferedWriter bW = new BufferedWriter(fW);
		bW.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bW.write(System.lineSeparator() + " Tetando quebra de linha");
		bW.write(System.lineSeparator() + " Mais um teste");
		
		bW.close();
	}
	


}

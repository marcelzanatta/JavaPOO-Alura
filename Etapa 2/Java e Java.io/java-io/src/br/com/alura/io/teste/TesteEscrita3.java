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
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream("lorem4.txt");
		//PrintWriter ps = new PrintWriter("lorem4.txt");
		
		ps.println("Testando println");
		ps.println("linha 2 ");
		ps.print("linha 3");
				
		ps.close();
	}
	


}

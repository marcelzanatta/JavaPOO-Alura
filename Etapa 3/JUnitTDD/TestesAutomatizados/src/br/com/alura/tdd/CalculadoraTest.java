package br.com.alura.tdd;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraTest {

	@Test
	public void testeSomaNumeroInteiros(){
		Calculadora calc = new Calculadora();
		int soma = calc.soma(3, 7);
		
		Assert.assertEquals(10, soma);
	}
}

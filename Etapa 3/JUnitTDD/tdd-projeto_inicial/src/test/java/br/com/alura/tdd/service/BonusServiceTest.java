package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeraParaFuncionarioComSalarioMuitoAlto() {
		
		
		Funcionario func = new Funcionario("Marcel", LocalDate.now(), new BigDecimal("25000"));
		
		BonusService calcBonus = new BonusService();		
//		assertThrows(IllegalArgumentException.class,
//				() -> calcBonus.calcularBonus(func));
		
		try {
			calcBonus.calcularBonus(func);
			fail("Não deu exception");
		} catch (Exception e) {
			
		}
		
	}
	
	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		
		Funcionario func = new Funcionario("Marcel", LocalDate.now(), new BigDecimal("5000"));
		
		BonusService calcBonus = new BonusService();
		BigDecimal bonus = calcBonus.calcularBonus(func); 
		
		assertEquals(new BigDecimal("500.00"),bonus);
		
	}
	
	@Test
	void bonusSalarioLimiteDezMil() {
		
		Funcionario func = new Funcionario("Marcel", LocalDate.now(), new BigDecimal("10000"));
		
		BonusService calcBonus = new BonusService();
		BigDecimal bonus = calcBonus.calcularBonus(func);  
		
		assertEquals(new BigDecimal("1000.00"),bonus);
		
	}
	
	
	

}

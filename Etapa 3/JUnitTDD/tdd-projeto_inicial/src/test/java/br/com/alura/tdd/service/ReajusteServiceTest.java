package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
		
		private ReajusteService reajuste;
		private Funcionario func;
		
		@BeforeEach
		void inicializar() {			
			this.reajuste = new ReajusteService();
			this.func = new Funcionario("Marcel", LocalDate.now(), new BigDecimal("1000"));
		}
	
	
		@Test
		void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
					
			reajuste.calculoReajuste(func, Desempenho.A_DESEJAR);			
			assertEquals(new BigDecimal("1030.00"),func.getSalario());
		}
		 
		@Test
		void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom() {
			
			reajuste.calculoReajuste(func, Desempenho.BOM);			
			assertEquals(new BigDecimal("1150.00"),func.getSalario());
		}
		
		@Test
		void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForExelente() {
			
			reajuste.calculoReajuste(func, Desempenho.EXELENTE);			
			assertEquals(new BigDecimal("1200.00"),func.getSalario());
			
		}
}

/**
 * 
 */
package br.edu.iftm;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Dione
 *
 */
public class funcoesTest {

	/**
	 * Test method for {@link br.edu.iftm.funcoes#calculo_parcela_min(float)}.
	 */
	@Test
	public void testCalculo_parcela_min() {
		
		assertEquals(1000, funcoes.calculo_parcela_min(2500), 0.01);
		
	}

	/**
	 * Test method for {@link br.edu.iftm.funcoes#calculo_entrada(double)}.
	 */
	@Test
	public void testCalculo_entrada() {
		
		assertEquals(6000, funcoes.calculo_entrada(30000), 0.01);
		
	}

	/**
	 * Test method for {@link br.edu.iftm.funcoes#juros(float)}.
	 */
	@Test
	public void testJuros() {

		assertEquals(0.02, funcoes.juros(2), 0.01);
		
	}

	/**
	 * Test method for {@link br.edu.iftm.funcoes#valor_parcela(double, double, int, double)}.
	 */
	@Test
	public void testValor_parcela() {

		assertEquals(2836.8794, funcoes.valor_parcela(0.02, 35000, 12, 5000), 0.1);
		
	}
	
}

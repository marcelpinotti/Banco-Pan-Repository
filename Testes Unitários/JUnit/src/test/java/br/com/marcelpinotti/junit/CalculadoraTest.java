package br.com.marcelpinotti.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void testSomar() {
		System.out.println("somar");
		int n1 = 5;
		int n2 = 5;
		
		Calculadora calculadoraTeste = new Calculadora();
		double resultadoEsperado =10;
		double result = calculadoraTeste.aumentar(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}
	

	@Test
	public void testSubtrair() {
		System.out.println("subtrair");
		int n1 = 5;
		int n2 = 3;
		
		Calculadora calculadoraTeste = new Calculadora();
		double resultadoEsperado = 2;
		double result = calculadoraTeste.diminuir(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}
	
	@Test
	public void potencia() {
		System.out.println("potencia");
		int n1 = 5;
		int n2 = 2;
		
		Calculadora calculadoraTeste = new Calculadora();
		int resultadoEsperado = 25;
		int result = calculadoraTeste.potencia(n1, n2);
		assertEquals(resultadoEsperado, result, "erro potencia");
	}
	
	

}

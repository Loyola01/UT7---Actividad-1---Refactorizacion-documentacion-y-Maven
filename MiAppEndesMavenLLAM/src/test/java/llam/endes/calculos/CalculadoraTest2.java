package llam.endes.calculos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

class CalculadoraTest2 {

	@Test
	void testDividir1() {
		assertEquals(1,Calculadora.dividir(4, 4));
	}
	
	@Test
	void testDividir2() {
		assertEquals(1,Calculadora.dividir(3, 2));
	}
	
	@Test
	void testDividir3() {
		assertThrows(java.lang.ArithmeticException.class,()->Calculadora.dividir(4, 0));
	}
	
	@Test
	void testDividir4() {
		assertAll("Juntado Test",
				()->assertEquals(1, Calculadora.dividir(4, 4)),
				()->assertEquals(1, Calculadora.dividir(3, 2))
				);
	}
	
	@Test
	void testDividir5() {
		assertTrue(Calculadora.dividir(6, 2)==3);
	}
	
	@Test
	void testPar() {
		assertTrue(Calculadora.esPar(21));
		
	}
	
	@Test
	void testParOImpar() {
		assertEquals("impar", Calculadora.esParOImpar(11));
		assertEquals("par", Calculadora.esParOImpar(10));
	}
	

}

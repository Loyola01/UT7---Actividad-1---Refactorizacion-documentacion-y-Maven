package llam.endes.calculos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testRestar() {
		assertEquals(5,Calculadora.restar(10, 5));
		assertEquals(1, Calculadora.restar(6, 5));
		assertEquals(6, Calculadora.restar(8, 2));
	}

}

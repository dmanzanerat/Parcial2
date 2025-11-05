package Preguntas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ParcialTest{

	@Test
	void testRaizPositiva() {
		Parcial p = new Parcial();
		String raices = p.pregunta1(2, 8, 5);
		assertTrue(raices.contains("-0.7752551286084111"));
		assertTrue(raices.contains("-3.224744871391589"));
		System.out.println(raices);
	}
	
	@Test
	void testRaizNegativa() {
		Parcial p = new Parcial();
		ArithmeticException e = assertThrows(ArithmeticException.class, () -> p.pregunta1(25, 3, 7));
		assertTrue(e.getMessage().contains("raiz negativa"));
		System.out.println(e);
	}
	
	@Test
	void testDenominadorCero(){
		Parcial p = new Parcial();
		ArithmeticException e = assertThrows(ArithmeticException.class, () -> p.pregunta1(0, 34, 11));
		assertTrue(e.getMessage().contains("denominador no puede ser cero"));
		System.out.println(e);
	}
}
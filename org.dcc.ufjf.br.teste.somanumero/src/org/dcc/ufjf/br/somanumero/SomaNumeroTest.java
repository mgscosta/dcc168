package org.dcc.ufjf.br.somanumero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomaNumeroTest {

	@Test
	void CasoTeste01RequisitoR1TodosDefTodosUsos() {
		SomaNumero testObject = new SomaNumero();
		assertEquals(testObject.somaNumero(4,7), 5);
	}
	
	@Test
	void CasoTeste02RequisitoR2TodosUsos() {
		SomaNumero testObject = new SomaNumero();
		assertEquals(testObject.somaNumero(6, 7), 0);
	}

}

package org.dcc.ufjf.br.somanumero;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomaNumeroTest {

	@Test
	public void CasoTeste01RequisitoR1TodosDefTodosUsos() {
		SomaNumero testObject = new SomaNumero();
		assertEquals(testObject.somaNumero(4,7), 5);
	}
	
	@Test
	public void CasoTeste02RequisitoR2TodosUsos() {
		SomaNumero testObject = new SomaNumero();
		assertEquals(testObject.somaNumero(6, 7), 0);
	}

}



package org.dcc.ufjf.br.boleto;

import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

public class BoletoTest {

    Date vcto = new Date("22/01/2022");
    Date pgto = new Date("24/02/2022");

    @Mock
    private Funcoes funcoesMock;

    @TestSubject
    private Boleto boleto = new Boleto(funcoesMock);

    @Before
    public  void setup() {
        EasyMockSupport.injectMocks(this);
    }

    @Test
    public void test(){
        expect(funcoesMock.calcDiasAtraso(vcto, pgto)).andReturn(1.0);
        replay(funcoesMock);

        assertEquals(101.0, boleto.calculaValorAPagar(100, vcto, pgto), 0.1);
    }

}
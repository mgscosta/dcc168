package org.dcc.ufjf.br.boleto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	private static Funcoes funcoes;

	public static void main(String[]args) throws ParseException {	
		System.out.println("Calcula Valor a Pagar");
		
		Boleto boleto = new Boleto(funcoes);	
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date vcto = format.parse("14/11/2019");
		Date pgto = format.parse("15/11/2019");
		
		System.out.println("Dias de atraso: "+ funcoes.calcDiasAtraso(vcto, pgto));
		System.out.println("Valor a pagar é:"+ boleto.calculaValorAPagar(500, vcto, pgto));
	}
}
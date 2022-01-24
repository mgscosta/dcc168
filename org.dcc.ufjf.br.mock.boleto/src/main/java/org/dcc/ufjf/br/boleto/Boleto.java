package org.dcc.ufjf.br.boleto;

import java.util.Date;

public class Boleto {

	private Funcoes funcoes;
	
	public Boleto(Funcoes funcoes) {
		this.funcoes = funcoes;
	}
	
	public double calculaValorAPagar(double valor, Date vencimento, Date pgto) {
		double valorFinal;
		if(vencimento.before(pgto)) {
			double periodoAtraso = funcoes.calcDiasAtraso(vencimento, pgto);
			valorFinal = valor + (valor * 1/100 * periodoAtraso);
		} else {
			valorFinal = valor;
		}
		return valorFinal;
	}
}
package org.dcc.ufjf.br.somanumero;

public class SomaNumero {

	public int somaNumero(int n, int m) {

		int nro, soma = 0;
		System.out.println("Valor de N �: " + n + "\n");
		System.out.println("Valor de M �: " + m + "\n");

		if (n < m) {
			if (n % 2 == 0) {
				nro = n + 1;
				System.out.println("Valor de n: " + n + ". Valor de nro �: " + n + 1);
			} else {
				nro = n;
				System.out.println("Valor de n: " + n + ". Valor de nro �: " + nro);
			}
			soma = 0;
			System.out.println("Valor da vari�vel soma �:" + soma);
			System.out.println("Valor da vari�vel nro �:" + nro + " e de m �:" + m);

			while (nro < m) {
				System.out.println(nro + " � menor que " + m);
				if (nro > 0) {
					System.out.println("nro � maior que 0");
					soma = soma + nro;
					System.out.println("Valor da vari�vel soma �:" + soma);
				}
				System.out.println("Valor de nro PR�-incremento: " + nro);
				nro = nro + 2;
				System.out.println("Valor de nro P�S-incremento: " + nro);
			}
			System.out.println("O valor de N: " + n + ", M: " + m + ", SOMA: " + soma);
		} else {
			System.out.println("INTERVALO INCORRETO");
		}
		System.out.println("Soma �: " + soma);
		return soma;
	}

	public static void main(String[] args) {

	}
}
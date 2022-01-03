package org.dcc.ufjf.br.somanumero;

public class SomaNumero {

	public int somaNumero(int n, int m) {

		int nro, soma = 0;
		System.out.println("Valor de N é: " + n + "\n");
		System.out.println("Valor de M é: " + m + "\n");

		if (n < m) {
			if (n % 2 == 0) {
				nro = n + 1;
				System.out.println("Valor de n: " + n + ". Valor de nro é: " + n + 1);
			} else {
				nro = n;
				System.out.println("Valor de n: " + n + ". Valor de nro é: " + nro);
			}
			soma = 0;
			System.out.println("Valor da variável soma é:" + soma);
			System.out.println("Valor da variável nro é:" + nro + " e de m é:" + m);

			while (nro < m) {
				System.out.println(nro + " é menor que " + m);
				if (nro > 0) {
					System.out.println("nro é maior que 0");
					soma = soma + nro;
					System.out.println("Valor da variável soma é:" + soma);
				}
				System.out.println("Valor de nro PRÉ-incremento: " + nro);
				nro = nro + 2;
				System.out.println("Valor de nro PÓS-incremento: " + nro);
			}
			System.out.println("O valor de N: " + n + ", M: " + m + ", SOMA: " + soma);
		} else {
			System.out.println("INTERVALO INCORRETO");
		}
		System.out.println("Soma é: " + soma);
		return soma;
	}

	public static void main(String[] args) {

	}
}
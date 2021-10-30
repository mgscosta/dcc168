package aula0;

public class Main {
	
	// Programa A
	public static int findLast (int [] x, int y) {
		// Corrigido: i tem que ser >= 0 e não > 0, para que todo o array seja verificado e add static
		for(int i = x.length -1; i >= 0; i--) {
			if(x[i] == y) {
				return i;
			}
		}
		return -1;
		// Test: x = [2,3,5]; y = 2
		// Expected: 0
	}
	
	// Programa B
	public static int lastZero(int [] x ) {
		// Corrigido: o for tem que começar da ultima posição do array e terminar na primeira, e não o contrário.
		for(int i = x.length - 1; i >=0; i--) {
			if(x[i] == 0) {
				return i;
			}
		}
		return -1;
		// Test: x = [0,1,0]
		// Expected: 2
	}
	
	// Programa C
	public static int countPositive (int[] x) {
		int count =0;
		for(int i = 0; i < x.length; i++) {
			// Corrigido: deve ser x[i] > 0, pois 0 não é positivo e add static
			if(x[i] > 0) {
				count++;
			}
		}
		return count;
		// Test: x = [-4,2,0,2]
		// Expected: 2
	}
	
	// Programa D
	public static int oddOrPos (int [] x) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			// Corrigido: deve possuir também a condição levando em consideração o resultado do mod negativo
			if(x[i] % 2 == 1 || x[i] % 2 == -1 || x[i] > 0) {
				count++;
			}
		}
		return count;
		// Test: x = [-3,-2,0,1,4]
		// Expected: 3
	}

	public static void main(String[] args) {
		System.out.println(findLast(new int [] {2,3,5}, 2)); // Programa A
		System.out.println(lastZero(new int[] {0,1,0})); // Programa B
		System.out.println(countPositive(new int[] {-4,2,0,2})); // Programa C
		System.out.println(oddOrPos(new int[] {-3,-2,0,1,4})); // Programa D	
	}

}

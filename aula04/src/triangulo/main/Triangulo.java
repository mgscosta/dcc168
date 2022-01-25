package triangulo.main;

public class Triangulo {
	
	int l1, l2, l3;
	
	public Triangulo(int l1, int l2, int l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}
	
	public void verificaTriangulo() {
		if (l1 + l2 > l3 && l2 + l3 > l1 && l1 + l3 > l2 ) {
			
			if ((l1 == l2) && (l2 == l3)) {
				System.out.println("É equilátero");
			}
			
			if((l1 == l2 && l1 != l3) || (l2 == l3 && l2 != l1) || (l1 == l3 && l1 != l2)) {
				System.out.println("É isóceles");
			}
			
			if((l1 != l2 && l1 != l3) && (l2 != l3)) {
				System.out.println("É escaleno");
			};
			
		}
		else {
			System.out.println("Não é triangulo");
		}
	}

}

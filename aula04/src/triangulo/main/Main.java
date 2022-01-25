package triangulo.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangulo equilatero = new Triangulo(3,3,3);
		Triangulo isoceles = new Triangulo(3,3,2);
		Triangulo escaleno = new Triangulo(3,4,5);
		
		equilatero.verificaTriangulo();
		isoceles.verificaTriangulo();
		escaleno.verificaTriangulo();
	}

}

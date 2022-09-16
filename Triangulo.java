package triangulo;

public class Triangulo {
	private int lado1 = 2, lado2 = 2, lado3 = 2;
	
	public int calculaPerimetro(int perimetro) {
		perimetro = this.lado1 + this.lado2 + this.lado3;
		return perimetro;
	}
		
	public Triangulo (int l1, int l2, int l3) {
		if((l1<l2+l3) && (l2<l1+l3) && (l3<l1+l2)) {
			this.lado1 = l1;
			this.lado2 = l2;
			this.lado3 = l3;
		} else {
			System.out.println("Valores inválidos");
			System.out.println("O triangulo foi inicializado com os três lados iguais a dois");
		}
		
	}
	
	public Triangulo(int n) {
		this.lado1 = n;
		this.lado2 = n;
		this.lado3 = n;
	}
	
}

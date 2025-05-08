abstract class FiguraGeometrica{
	public abstract int calcularArea();

	public abstract int calcularPerimetro();
}

class Retangulo extends FiguraGeometrica{
	private int base;
	private int altura;

	public Retangulo(int base, int altura){
		this.base  = base;
		this.altura = altura;
	}

	public int calcularArea(){
		
		return base * altura;
	}

	public int calcularPerimetro(){
		return 2 * (base + altura);
		
	}
}

public class Main{
	public static void main(String[] args){
		Retangulo retangulo = new Retangulo(2,2);

		System.out.println("Area: " + retangulo.calcularArea() + " Perimetro: " + retangulo.calcularPerimetro());

	}
}
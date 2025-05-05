class Calculadora{
	final int somar(int a, int b){	
		return a + b;
	}
}

public class CalculadoraCientifica extends Calculadora{
	//public int somar(int a, int b){	
		//return a + b;
	
	public static void main(String[] args){
		Calculadora calculadora = new Calculadora();
		System.out.println("Resultado: " + calculadora.somar(4,5));
	}
}

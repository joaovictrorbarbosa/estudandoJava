public class PrecedenciaOperadoresAtribuicao{
	public static void main(String[] args) {
		int numero = 5;

		int numero1 = ++numero;
		System.out.println(numero1);
		int numero2 = --numero;
		System.out.println(numero2);
		int numero3 = numero ++;
		System.out.println(numero3);
		int numero4 = numero --;
		System.out.println(numero4);
	}
}
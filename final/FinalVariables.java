public class FinalVariables{
	private final int numeroMaximo = 10;
	private final String mensagem = "Bem vindo ao mundo da programação";

	public void imprimirValores(){
		System.out.println("Numero Maximo: " +numeroMaximo);
		System.out.println("Mensagem: " +mensagem);
	}

	public static void main(String[] args){
		FinalVariables exemplo = new FinalVariables();

		exemplo.imprimirValores();
	}
}



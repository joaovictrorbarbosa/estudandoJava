class SuperClasse{
	public void imprime(){
		System.out.println("Imprime");
	}
}

class MinhaClasse extends SuperClasse{
	@Override
	public void imprime(){
		System.out.println("Imprime diferente");
	}
}

public class Teste{
	public static void main(String[] args){
		MinhaClasse classe = new MinhaClasse();

		classe.imprime();
	}
}
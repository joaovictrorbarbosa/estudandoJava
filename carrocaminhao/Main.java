interface Veiculo{
	void iniciar();
	void parar();

	default void buzinar(){
		System.out.println("BIII BII");
	}
}

class Carro implements Veiculo{
	public void iniciar(){
	System.out.println("O carro está andando");
	}

	public void parar(){
	System.out.println("O carro parou");
	}
}

class Caminhao implements Veiculo{
	public void iniciar(){
	System.out.println("O caminhão está andando");
	}
	public void parar(){
	System.out.println("O caminhao parou");
	}
}

public class Main{
	public static void main(String[] args){
		Carro carro = new Carro();
		carro.iniciar();
		carro.parar();
		carro.buzinar();

		Caminhao caminhao = new Caminhao();
		caminhao.iniciar();
		caminhao.parar();
		caminhao.buzinar();
	}
}
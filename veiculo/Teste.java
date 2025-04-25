class Veiculo{
	public void acelerar(){
		System.out.println("Veiculo acelerando!");
	}
}

class Carro extends Veiculo{
	
	public void acelerar(){
		super.acelerar();
		System.out.println("Carro acelerando");
	}
}

public class Teste{
	public static void main(String[]args){
		Carro palio = new Carro();
		Veiculo xre = new Veiculo();

		palio.acelerar();
		xre.acelerar();
 	}
}

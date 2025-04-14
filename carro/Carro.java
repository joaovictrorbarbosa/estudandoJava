public class Carro{
	String marca;
	String modelo;
	int ano;

	Carro() {}

	Carro(String marcaInit, String modeloInit){
		marca = marcaInit;
		modelo = modeloInit;
	}

	Carro(String marcaInit, String modeloInit, int anoInit){
		marca = marcaInit;
		modelo = modeloInit;
		ano = anoInit;
	}

public static void main(String[] args) {
	
	Carro carro1 = new Carro();
	System.out.println(carro1.marca);
	System.out.println(carro1.modelo);
	System.out.println(carro1.ano);

	Carro carro2 = new Carro ("Fiat",  "Punto");
	System.out.println(carro2.marca);
	System.out.println(carro2.modelo);
	System.out.println(carro2.ano);

	Carro carro3 = new Carro ("Lamborghini", "Urus", 2025);
	System.out.println(carro3.marca);
	System.out.println(carro3.modelo);
	System.out.println(carro3.ano);

	}
}
public class Carteira{
	public static void main(String[] args){
		int codigoDeSaida = 3;

		for (int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++){
			if (codigoCarteirinha == codigoDeSaida) {
				System.out.println("CODIGOS IGUAIS");
				break;
				}
				if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
				System.out.println("Codigo é aceito.");
				continue;
				}
			
				System.out.println("Não aceitamos o codigo de carteirinha " + codigoCarteirinha + " na SantaCasa.");
			}
		}
	}
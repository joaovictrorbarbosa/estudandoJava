public class Satisfacao {
	public static void main(String[] args){
		int nivel = 5;

		Object satisfacao = switch(nivel) {
		case 1 -> "Muito Insatisfeito";
		case 2 -> "Insatisfeito";
		case 3 -> "Neutro";
		case 4 -> "Satisfeito";
		case 5 -> "Muito Satisfeito";
		default -> "desconhecido";
		};
		System.out.println(satisfacao);
	}
}
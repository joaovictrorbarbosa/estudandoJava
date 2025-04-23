class Personagem{
	String nome;
	int nivelDePoder;

	Personagem(String nomeInit, int nivelDePoderInit){
		this.nome = nomeInit;
		this.nivelDePoder = nivelDePoderInit;
	}
	public void tentarAumentarNivelDePoder(int nivelDePoder){
		nivelDePoder += 10;
	}
	public void alterarNome(Personagem personagem){
		personagem.nome = "Soldado";
	}

	public void aumentarNivelDePoder(){
		this.nivelDePoder += 10;
	}
}

public class PassagemParametros{
	public static void main(String[] args){
		Personagem campeao = new Personagem ("Mago", 40);

		System.out.println("Tentando aumentar o nivel de poder: " + campeao.nivelDePoder);
		campeao.tentarAumentarNivelDePoder(campeao.nivelDePoder);
		System.out.println("Depois de tentar aumentar nivel de poder: " + campeao.nivelDePoder);

		System.out.println("Antes de alterar nome: " + campeao.nome);
		campeao.alterarNome(campeao);
		System.out.println("Após mudar nome: " +campeao.nome);

		System.out.println("Antes de aumentar nivel de poder: " +campeao.nivelDePoder);
		campeao.aumentarNivelDePoder();
		System.out.println("Depois de aumentar nivel de poder: " + campeao.nivelDePoder);
	}
}
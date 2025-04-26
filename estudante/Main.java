class Pessoa{
	public String nome;
	public int idade;

	public Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
}

class Estudante extends Pessoa{
	int matricula;

	public Estudante(String nome, int idade, int matricula){
		super(nome, idade);
		this.matricula = matricula;
	}
}

public class Main{
	public static void main(String[] args){
		Estudante estudante = new Estudante("João", 23, 1345);
		System.out.println("Nome: " + estudante.nome);
		System.out.println("Idade: " + estudante.idade);
		System.out.println("Matricula: " + estudante.matricula);
	}
}	
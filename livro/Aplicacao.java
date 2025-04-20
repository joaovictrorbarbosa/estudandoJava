class Livro{
	public String titulo;
	private String autor;
	protected int anoPublicacao;
	 double preco;

	Livro(){}

	Livro(String tituloInit, String autorInit){
		titulo = tituloInit;
		autor = autorInit;
	}

	Livro(String tituloInit, String autorInit, int anoPublicacaoInit, double precoInit){
		titulo = tituloInit;
		autor = autorInit;
		anoPublicacao = anoPublicacaoInit;
		preco = precoInit;
	}
	public String obterInfo(){
		return "Titulo: " + titulo + ", Autor: " + autor + ", Ano de Publicacao: " + anoPublicacao + ", Preço: R$" + preco;
	}
}

public class Aplicacao{
	public static void main(String[] args){
		Livro livro1 = new Livro ();
		System.out.println(livro1.obterInfo());
		Livro livro2 = new Livro("ÁGAPE", "Pde. Marcelo Rossi");
		System.out.println(livro2.obterInfo());
		Livro livro3 = new Livro ("Nada pode me ferir", "David Goggins", 2020, 50.99);
		System.out.println(livro3.obterInfo());
	}
}
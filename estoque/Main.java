interface Produto{
	String getNome();
	int getQuantidade();

	void adicionarQuantidade(int quantidade);
	void removerQuantidade(int quantidade);
}

class ProdutoImpl implements Produto{
	private String nome;
	private int quantidade;

	public ProdutoImpl(String nome, int quantidade){
		this.nome = nome;
		this.quantidade = quantidade;
	}

	@Override
	public int getQuantidade(){
		return quantidade;
	}

	@Override
	public String getNome(){
		return nome;
	}

	@Override
	public void adicionarQuantidade(int quantidade){
		this.quantidade += quantidade;
	} 	

	@Override
	public void removerQuantidade(int quantidade){
		if (this.quantidade >= quantidade){
			this.quantidade -= quantidade;
		} else {
			System.out.println("Quantidade insuficiente em estoque");

		}
	}
}

public class Main{
	public static void main(String[] args){
		ProdutoImpl produto = new ProdutoImpl("LÁPIS", 100);
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		produto.adicionarQuantidade(20);
		System.out.println("Nova quantidade: " + produto.getQuantidade());
		produto.removerQuantidade(50);
		System.out.println("Nova quantidade, após remoção: " + produto.getQuantidade());
	}
}
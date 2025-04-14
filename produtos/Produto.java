public class Produto{
	private String nome;
	private double preco;
	private int quantidadeEmEstoque;

	public Produto (String nomeInit, double precoInit, int quantidadeEmEstoqueInit) {
		this.nome  = nomeInit;
		this.preco = precoInit;
		this.quantidadeEmEstoque = quantidadeEmEstoqueInit;
	}
	public void mostrarProduto(){
		System.out.println("NOME: " + nome);
		System.out.println("PREÇO: R$" + preco);
		System.out.println("QUANTIDADE EM ESTOQUE: " + quantidadeEmEstoque);
	}
}

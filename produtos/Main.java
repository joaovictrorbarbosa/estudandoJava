public class Main{
	public static void main(String[] args){
		Produto produto1 = new Produto ("Caneta BIC",  2.55, 10);
		Produto produto2 = new Produto ("Lapiseira Faber", 5.00, 100);

		produto1.mostrarProduto();
		produto2.mostrarProduto();
	}
}
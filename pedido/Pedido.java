interface PedidoRestaurante{
	void adicionarItem(String item, double preco);
	double calcularTotal();
}

public class Pedido implements PedidoRestaurante{
	private double total = 0;

	@Override
	public void adicionarItem(String item, double preco){
	 	System.out.println("ADICIONANDO: " + item + " DE VALOR: R$" + preco);
	 	total += preco;
	}

	public double calcularTotal(){
		return total;
	}

	public static void main(String[] args){
		Pedido pedido = new Pedido();
		pedido.adicionarItem("Hamburguer", 35.50);
		pedido.adicionarItem("Batata - frita", 20.00);
		pedido.adicionarItem("Refrigerante", 10.00);

		System.out.println("Valor total do pedido: R$" + pedido.calcularTotal());
	}
}
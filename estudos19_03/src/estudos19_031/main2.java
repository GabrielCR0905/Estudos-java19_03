package estudos19_031;

public class main2 {

	public static void main(String[] args) {
		Carrinho c = new Carrinho();
		
		c.adicionarProduto(new Produto("Tenis",200.0,5));
		c.adicionarProduto(new Produto ("Meia", 20.0,10));
		System.out.println("Total da Compra: R$ " + c.calcularTotal());

	}

}

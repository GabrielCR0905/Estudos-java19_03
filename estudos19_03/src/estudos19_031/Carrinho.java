package estudos19_031;
import java.util.ArrayList;


public class Carrinho {
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	public void adicionarProduto(Produto p) {
		produtos.add(p);
		System.out.print("Produto"+ p.nome + "Adicionado ao Carrinho");
	}
	
	public double calcularTotal() {
		double total = 0;
		for(Produto p : produtos) {
			total += p.preco;
		}
		return total;
	}

}

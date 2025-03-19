package estudos19_031;

public class Produto {

	String nome;
	double preco;
	int estoque;
	
	
	
	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		
		
	}
	
	public void exibirInfo() {
		System.out.println("Produto: " + nome + " | Preço: R$" + preco + "| Estoque: "+ estoque);
	}
	
	public double vender(int quantidade) {
		if (quantidade > estoque) {
			System.out.print("Estoque Insuficiente");
			return 0;
		}
		estoque -=quantidade;
		double total = quantidade * preco;
		System.out.println("Venda Realizada! total: R$" + total);
		return total;
		
	}
}

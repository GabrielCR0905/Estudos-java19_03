package estudos19_031;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("Camisa", 50.0,10);
		
		p1.exibirInfo();
		p1.vender(3);
		p1.exibirInfo();

	}

}

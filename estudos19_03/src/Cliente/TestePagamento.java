package Cliente;

class Pagamento {
	
	public void processarPagamento(double valor, String metodo) {
		if(metodo.equalsIgnoreCase("Dinheiro")|| metodo.equalsIgnoreCase("Cartão")|| metodo.equalsIgnoreCase("pix")) {
			System.out.print("Pagamento de R$" + valor + "Aprovado via " + metodo);
		}
		else {
			System.out.print("Erro:Metodo de pagamento invalido!");
		}
	}
}

 
	public class TestePagamento {
 

	public static void main(String[] args) {
		Pagamento p = new Pagamento();
		
		p.processarPagamento(100.0, "Dinheiro");
		p.processarPagamento(50,"PARCELADO");

	}

}

package Cliente;

class Cliente {

	String nome;
	String cpf;
	double saldo;
	
	public Cliente(String nome, String cpf, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
		
	}
	
	
	public void realizarCompra(double valor) {
		
		if(valor >saldo) {
			System.out.print("Saldo insuficiente" + valor);
		}else {
			saldo -= valor;
			System.out.print("compra de R$" + valor + "Realizada com sucesso, saldo" + saldo);
			
		}
	}
}

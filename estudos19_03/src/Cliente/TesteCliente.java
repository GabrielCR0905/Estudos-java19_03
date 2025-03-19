package Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente ("Joao","12-3-1231-41",500.00);
		
		
		cliente.realizarCompra(300.0);
		cliente.realizarCompra(100.0);

	}

}

package contaBancaria;

public class ContaTeste {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.cliente = "Daniel";
		conta.saldo = 4_000.00;
		conta.exibesaldo();
		
		conta.saque(2000);
		conta.exibesaldo();
		
		conta.deposito(8000);
		conta.exibesaldo();
	}

}

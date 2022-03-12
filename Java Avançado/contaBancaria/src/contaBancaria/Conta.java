package contaBancaria;

public class Conta {
 String cliente;
 double saldo;
 void exibesaldo() {
	 System.out.println(cliente + " seu saldo é " + saldo);
 }
 void saque(double valor) {
	  saldo-= valor;
 }
 
 void deposito(double valor) {
	 saldo += valor;
 }
 
}

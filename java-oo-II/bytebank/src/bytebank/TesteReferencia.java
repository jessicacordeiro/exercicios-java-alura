package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira conta R$ " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta R$ " + segundaConta.saldo);
		
		segundaConta.saldo += 150;
		System.out.println("Saldo da segunda conta R$ " + segundaConta.saldo);
		
		// Os dois Primeira e Segunda conta são para a mesma referência.
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println(" São a mesma conta! ");
			System.out.println(" " + primeiraConta);
			System.out.println(" " + segundaConta);
		} else {
			System.out.println("São contas diferentes");
		}		
	}
}

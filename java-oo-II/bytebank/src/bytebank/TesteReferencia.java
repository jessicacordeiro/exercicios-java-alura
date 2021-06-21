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
		
		// Os dois Primeira e Segunda conta s�o para a mesma refer�ncia.
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println(" S�o a mesma conta! ");
			System.out.println(" " + primeiraConta);
			System.out.println(" " + segundaConta);
		} else {
			System.out.println("S�o contas diferentes");
		}		
	}
}

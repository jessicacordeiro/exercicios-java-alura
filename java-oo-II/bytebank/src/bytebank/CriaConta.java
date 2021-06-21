package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		
		// Primeira Conta
		Conta primeiraConta = new Conta();
		primeiraConta.agencia = 1562;
		primeiraConta.numero = "15639-9";
		primeiraConta.titular = "Ana Carolina";
		primeiraConta.saldo = 200;
		
		System.out.println("--------------- PRIMEIRA CONTA -------------------\n");
		System.out.println("Ag�ncia: " + primeiraConta.agencia);
		System.out.println("N�mero da Conta: " + primeiraConta.numero);
		System.out.println("Senha: " + primeiraConta.titular);
		System.out.println("Saldo: " + primeiraConta.saldo);
		
		System.out.println("\n*** DEPOSITO ***\n");
		primeiraConta.saldo += 100;
		System.out.println("Foi depositado na sua conta o valor de R$ 100,00. Saldo atual � R$ " + primeiraConta.saldo);
		
		// Segunda Conta
		Conta segundaConta = new Conta();
		segundaConta.agencia = 2563;
		segundaConta.numero = "25636-6";
		segundaConta.titular = "Maria Flor�ncio";
		segundaConta.saldo = 182;
		
		System.out.println("\n--------------- SEGUNDA CONTA -------------------\n");
		System.out.println("Ag�ncia: " + segundaConta.agencia);
		System.out.println("N�mero da Conta: " + segundaConta.numero);
		System.out.println("Senha: " + segundaConta.titular);
		System.out.println("Saldo: " + segundaConta.saldo);
		
		System.out.println("\n******* DIFEREN�AS ENTRE AS DUAS CONTAS *****\n");
		
		System.out.println("A primeira conta tem R$ " + primeiraConta.saldo);
        System.out.println("A segunda conta tem R$ " + segundaConta.saldo);
		
		
		System.out.println("\n -> Testando se as contas n�o est�o se refer�nciando a mesma tabela. <- \n"); 
		if(primeiraConta == segundaConta) {
			System.out.println(" S�o a mesma conta! ");
		} else {
			System.out.println(" S�O CONTAS DIFERENTES!");
			System.out.println(" " + primeiraConta);
			System.out.println(" " + segundaConta);
		}	
	}
}

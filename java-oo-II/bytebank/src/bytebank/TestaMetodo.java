package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		// CONTA DE MAURÍCIO
		Conta conta1 = new Conta();
		conta1.agencia = 3562;
		conta1.numero = 36589-9;
		conta1.titular = "Maurício Alexandre";
		conta1.saldo = 360;
		
		System.out.println("--------------- CONTA 1 -------------------\n");
		System.out.println("Agência: " + conta1.agencia);
		System.out.println("Número da Conta: " + conta1.numero);
		System.out.println("Senha: " + conta1.titular);
		System.out.println("Saldo: " + conta1.saldo);
		
		System.out.println("\n*** DEPOSITOS ***\n");
		conta1.deposita(265);	
		System.out.println("Foi depositado na sua conta o valor de R$ 265,00 \n Saldo total R$ " + conta1.saldo);
		
		System.out.println("\n*** SAQUES ***\n");
		conta1.saca(150);
		System.out.println("Foi sacado da sua conta R$150,00.\n Saldo total R$ " + conta1.saldo);
		
		// CONTA DE SARA
		Conta conta2 = new Conta();
		conta2.agencia = 2563;
		conta2.numero = 25696-6;
		conta2.titular = "Sara Cordeiro";
		conta2.saldo = 360;
		
		System.out.println("\n--------------- CONTA 2 -------------------\n");
		System.out.println("Agência: " + conta2.agencia);
		System.out.println("Número da Conta: " + conta2.numero);
		System.out.println("Senha: " + conta2.titular);
		System.out.println("Saldo: " + conta2.saldo);
		
		
		System.out.println("\n*** DEPOSITOS ***\n");
		conta2.deposita(1560);
		System.out.println("Foi depositado na sua conta R$ 1560,00.\n Saldo total R$ " + conta2.saldo);
		
		System.out.println("\n*** TRANSFERÊNCIAS ***\n");
		conta2.transfere(560, conta1);
		System.out.println("Foi Transferido R$560,00 para a conta de Sara. Saldo total R$ " + conta2.saldo);
		
		System.out.println("\n--------------- CONTA 1: Consulta de saldo -------------------\n");
		System.out.println("Maurício tem na conta R$ " + conta1.saldo); 
		
	}
}

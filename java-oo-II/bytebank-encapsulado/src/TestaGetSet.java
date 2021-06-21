
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1236, "02635-5");
        conta.setTitular(new Cliente());

        conta.getTitular().setNome("Alice Oliveira Silva");
        conta.getTitular().setProfissao("Desenvolvedora Front-end");
        conta.getTitular().setCpf("158.456.896-15");

        System.out.println("-------------------DADOS DA CONTA----------------------\n");
        System.out.println("Ag�ncia: " + conta.getAgencia());
        System.out.println("N�mero da Conta: " + conta.getNumero());
        System.out.println("Nome do T�tular: " + conta.getTitular().getNome());
        System.out.println("Profiss�o: " + conta.getTitular().getProfissao());
        System.out.println("CPF: " + conta.getTitular().getCpf());
        System.out.println();

        System.out.println("---------------TRANSA��ES DA SUA CONTA-------------------\n");

        System.out.println("Saldo banc�rio: " + conta.getSaldo());
        System.out.println();

        System.out.println("**DEPOSITOS**");

        conta.deposita(3500.00);
        System.out.println("Foi depositado na sua conta o valor de R$ " + conta.getSaldo());
        System.out.println("Saldo R$ " + conta.getSaldo());
        System.out.println();

        System.out.println("**SAQUES**");

        conta.saca(700.00);
        System.out.println("Foi sacado na sua conta o valor de R$700,00");
        System.out.println("Valor total do seu saldo R$ " + conta.getSaldo());
		
	}
}

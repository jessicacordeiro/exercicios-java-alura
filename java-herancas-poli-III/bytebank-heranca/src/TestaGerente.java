
public class TestaGerente {

	public static void main(String[] args) {
		
		// Gerente 1
		Gerente gerente = new Gerente();
		gerente.setNome("Luana Oliveira");
		gerente.setCpf("155.666.558-15");
		gerente.setProfissao("Gerente Mobile");
		gerente.setSalario(8563.25);
		gerente.setSenha(2222);
		
		boolean autenticou = gerente.autentica(2222);
		
		System.out.println("\n------------ GERENTE ----------------\n");
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Profissão: " + gerente.getProfissao());
		System.out.println("Salário R$ " + gerente.getSalario());
		System.out.println("Bonificação R$ " + gerente.getBonificacao());
		System.out.println(autenticou);
		
	}
}

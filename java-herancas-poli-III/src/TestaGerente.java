
public class TestaGerente {

	public static void main(String[] args) {
		
		// Gerente 1
		Gerente gerente = new Gerente();
		gerente.setNome("Luana Oliveira");
		gerente.setCpf("155.666.558-15");
		gerente.setProfissao("Gerente Mobile");
		gerente.setSalario(8563.25);
		
		System.out.println("\n------------ FUNCION�RIA(O) 1 ----------------\n");
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Profiss�o: " + gerente.getProfissao());
		System.out.println("Sal�rio R$ " + gerente.getSalario());
		System.out.println("Bonifica��o R$ " + gerente.getBonificacao());
		
	}
}

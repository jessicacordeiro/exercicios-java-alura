
public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		//Funcionario 
		Funcionario designer = new Designer();
		designer.setNome("Jéssica Cordeiro");
		designer.setCpf("125.255.589-18");
		designer.setProfissao("Ux Mobile");
		designer.setSalario(5639.36);
		
		System.out.println("\n------------ FUNCIONÁRIA(O) 1 ----------------\n");
		System.out.println("Nome: " + designer.getNome());
		System.out.println("CPF: " + designer.getCpf());
		System.out.println("Profissão: " + designer.getProfissao());
		System.out.println("Salário R$ " + designer.getSalario());
		System.out.println("Bonificação R$ " + designer.getBonificacao());
	}

}

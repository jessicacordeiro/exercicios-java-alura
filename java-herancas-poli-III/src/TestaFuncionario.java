
public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		//Funcionario 
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Jéssica Cordeiro");
		funcionario.setCpf("125.255.589-18");
		funcionario.setProfissao("Desenvolvedora Mobile");
		funcionario.setSalario(5639.36);
		
		System.out.println("\n------------ FUNCIONÁRIA(O) 1 ----------------\n");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Profissão: " + funcionario.getProfissao());
		System.out.println("Salário R$ " + funcionario.getSalario());
		System.out.println("Bonificação R$ " + funcionario.getBonificacao());
	}

}

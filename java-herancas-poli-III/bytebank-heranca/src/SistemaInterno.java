
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Funcionario funcionario) {
		boolean autenticou = funcionario.autentica(this.senha);
		if(autenticou) {
			System.out.println("O gerente tem acesso ao sistema!");
		} else {
			System.out.println("Acesso negado! Você não tem acesso a esse sistema.");
		}
	}

}

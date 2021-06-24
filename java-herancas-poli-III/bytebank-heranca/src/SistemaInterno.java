
public class SistemaInterno {
	
	private int senha = 0101;
	
	public void autentica(Autenticavel fa1) {
		
		boolean autenticou = fa1.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("O gerente tem acesso ao sistema!");
		} else {
			System.out.println("Acesso negado! Você não tem acesso a esse sistema.");
		}
	}
}

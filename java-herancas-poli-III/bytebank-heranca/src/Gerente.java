
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil auth;

	public Gerente() {
		this.auth = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("A bonifica��o da Gerente " + super.getNome() 
			+ " � o mesmo valor do seu sal�rio R$ " + super.getSalario());
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.auth.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.auth.autentica(senha);
	}
}

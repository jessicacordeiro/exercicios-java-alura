
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil auth;

	public Administrador() {
		this.auth = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
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

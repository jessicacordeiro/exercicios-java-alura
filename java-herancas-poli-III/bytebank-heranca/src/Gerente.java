
public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	
	public double getBonificacao() {
		System.out.println("A bonificação da Gerente " + super.getNome() + " é o mesmo valor do seu salário R$ " + super.getSalario());
		return super.getSalario();
	}
}

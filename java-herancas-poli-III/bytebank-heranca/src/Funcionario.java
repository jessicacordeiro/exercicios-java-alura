
// n�o pode instanciar dessa classe, porque � abstrata.
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private String profissao;
	private double salario;
	
	// m�todo sem corpo, n�o h� implemena��o para aplicar elas nas pr�prias classes filhas.
	public abstract double getBonificacao();
	
	/*public double getBonificacao() {
		return this.salario * 0.05;
	}*/
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}

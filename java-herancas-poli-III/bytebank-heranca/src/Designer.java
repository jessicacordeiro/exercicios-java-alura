
public class Designer extends Funcionario {

	public double getBonificacao() {
		double bonificacao = 200;
		double salarioTotal = bonificacao + super.getSalario();
		System.out.println("A bonificação do Designer " + super.getNome() + " é de R$ " 
				+ bonificacao + " Totalizando R$ " + salarioTotal);
		return bonificacao;
	}
}

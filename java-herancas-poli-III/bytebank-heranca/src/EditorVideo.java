
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		double bonificacao = 150;
		double salarioTotal = super.getSalario() + bonificacao;
		System.out.println("A bonifica��o do Editor de v�deo " + super.getNome() + " � de R$ " 
				+  bonificacao + " Totalizando R$ " + salarioTotal);
		return bonificacao;
	}
}

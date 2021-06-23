
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		double bonificacao = 150;
		double salarioTotal = super.getSalario() + bonificacao;
		System.out.println("A bonificação do Editor de vídeo " + super.getNome() + " é de R$ " 
				+  bonificacao + " Totalizando R$ " + salarioTotal);
		return bonificacao;
	}
}

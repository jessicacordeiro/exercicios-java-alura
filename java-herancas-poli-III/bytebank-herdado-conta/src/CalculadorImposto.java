
public class CalculadorImposto {
	
	private double totalImposto;
	
	public void registra(Tributario tributavel) {
		double valor = tributavel.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}

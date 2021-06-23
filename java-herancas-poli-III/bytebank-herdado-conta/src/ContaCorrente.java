
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, String numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorAsacar = valor + 0.2;
		return super.saca(valorAsacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}

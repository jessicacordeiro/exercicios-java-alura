
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, String numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}

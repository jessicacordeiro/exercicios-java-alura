

public class Conta {
	
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque Realizado com Sucesso!");
			return true;
		} else {
			System.out.println("Saque Negado! Saldo de R$ " + valor + " valor insuficiente na conta.");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			System.out.println("Transferência Realizada com Sucesso!");
			return true;
		}
		System.out.println("Tranferência Negad! Saldo de R$ " + valor + " valor insuficiente na conta.");
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}
}


public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		total++;
	}
	
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

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}
}

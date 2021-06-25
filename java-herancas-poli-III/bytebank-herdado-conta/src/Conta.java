
public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private String numero;
	private Cliente titular;
	private static int total;
	
	public Conta() {
		
	}
	
	public Conta(int agencia, String numero) {
		this.agencia = agencia;
		this.numero = numero;
		total++;
	}
	
	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
			
		this.saldo -= valor;
			System.out.println("Saque Realizado com Sucesso!");
			
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
			
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public String getNumero() {
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

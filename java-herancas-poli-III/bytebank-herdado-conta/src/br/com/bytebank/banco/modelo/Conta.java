package br.com.bytebank.banco.modelo;

/**
 * Classe que representa uma Conta e seus serviços.
 * 
 * @author Jessica Cordeiro
 * @version 0.1
 *
 */

public abstract class Conta extends Object implements Comparable<Conta> {
	
	protected double saldo;
	private int agencia;
	private String numero;
	private Cliente titular;
	private static int total;
	
	public Conta() {
		
	}
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agência e número.
	 * @param agencia
	 * @param numero
	 */
	
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
	
	/**
	 * Valor precisa ser menor ou igual ao saldo.
	 * @param valor
	 * @param destino
	 * @throws SaldoInsuficienteException
	 */
	
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
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outraConta = (Conta) ref;
		
		if(this.agencia != outraConta.agencia && this.numero != outraConta.numero) {
			return false;
		}
		return true;	
	}
	
	@Override
	public int compareTo(Conta outra) {
	
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
	    return "Numero: " + this.numero + ", Agencia: " + this.agencia + " Saldo R$ " + this.saldo;
	} 
}

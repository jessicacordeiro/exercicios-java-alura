
public class TesteSaca {
	
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(2256, "25569-9");
		
		conta.deposita(235.0);
		
		try {
			conta.saca(290.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}

}

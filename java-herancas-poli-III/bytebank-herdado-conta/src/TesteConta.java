
public class TesteConta {
	
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(1125, "12569-8");
		cc.deposita(250.00);
		
		ContaPoupanca cp = new ContaPoupanca(0065, "15269-8");
		cp.deposita(350.59);
		
		cc.transfere(100.0, cp);
		
		cc.saca(50.00);
		
		System.out.println("Valor da Conta Corrente R$ " + cc.getSaldo());
		System.out.println("Valor da Conta Poupança R$ " + cp.getSaldo());
	}
}

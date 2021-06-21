
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(2563, "25556-1");
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(2569, "14569-2");
		Conta conta3 = new Conta(1556, "25896-5");
		
		System.out.println(Conta.getTotal());
	}
}

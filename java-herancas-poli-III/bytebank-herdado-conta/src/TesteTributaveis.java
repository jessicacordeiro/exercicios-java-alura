
public class TesteTributaveis {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(2563, "25569-9");
		cc.deposita(300.0);
		
		SeguroVida seguro = new SeguroVida();
		
		CalculadorImposto calcImpos = new CalculadorImposto();
		calcImpos.registra(cc);
		calcImpos.registra(seguro);
		
		System.out.println(calcImpos.getTotalImposto());
	}

}

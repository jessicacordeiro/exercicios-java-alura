
public class TestaBanco {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Romilda Ferreira";
		cliente1.cpf = "256.896.698-18";
		cliente1.profissao = "Diarista";
		
		Conta conta1 = new Conta();
		conta1.deposita(1500);
		
		conta1.titular = cliente1;
		System.out.println(conta1.titular.nome);
	}
}

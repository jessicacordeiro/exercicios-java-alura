
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta marcela = new Conta();
		System.out.println(marcela.getSaldo());
		
		marcela.titular = new Cliente();
		System.out.println(marcela.titular);
		
		marcela.titular.nome = "Marcela";
		System.out.println(marcela.titular.nome);
	}

}

import java.util.Scanner;

public class TestaCondicionais {
	
	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		int idade, quantidadePessoas;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite a sua idade, por favor: ");
			idade = ler.nextInt();
			System.out.println("Caso esteja acompanhado, digite o número de acompanhantes: ");
			quantidadePessoas = ler.nextInt();
			
			boolean acompanhantes = quantidadePessoas >= 1;
			
			if (idade >= 18 || acompanhantes) {
				System.out.println("Seja(m) bem vinde(s)!");
			} else {
				System.out.println("Infelizmente você não pode entrar :(");
			}
		}
	}
}

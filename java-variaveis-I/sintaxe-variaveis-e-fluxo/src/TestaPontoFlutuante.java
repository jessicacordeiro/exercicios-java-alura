/* Quando você realiza uma conta que utiliza o int em uma conta 
 * de um número que tem como resposta números quebrados automáticamente o  
 * valor fica arredondado no console.
 */

/* No caso do double quando você realiza uma conta em direto na 
 * variável e a resposta são números quebrados você precisa apontar 
 * com . na conta para ele poder reconhecer que é realmente um double.
 */

public class TestaPontoFlutuante {
	public static void main(String[] args) {
		
		double salario = 2500.00;
		
		System.out.println("O meu salário é " + salario);
		
		// int valor = 12.5;       não compila.

        // int valor2 = 0.0;       não compila.

        double teste = 125.50;     // compila

        // int valor3 = teste;     não compila.
		
		double multiplicacao = 24.8 * 24;
		
		System.out.println(multiplicacao);
		
		int divisaoInt = 5 / 2; 
		
		System.out.println(divisaoInt);
		
		double divisao = 5.0 / 2;
		
		System.out.println(divisao);
		
	}
}

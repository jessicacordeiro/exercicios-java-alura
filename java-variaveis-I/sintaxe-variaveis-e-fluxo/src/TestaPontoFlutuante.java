/* Quando voc� realiza uma conta que utiliza o int em uma conta 
 * de um n�mero que tem como resposta n�meros quebrados autom�ticamente o  
 * valor fica arredondado no console.
 */

/* No caso do double quando voc� realiza uma conta em direto na 
 * vari�vel e a resposta s�o n�meros quebrados voc� precisa apontar 
 * com . na conta para ele poder reconhecer que � realmente um double.
 */

public class TestaPontoFlutuante {
	public static void main(String[] args) {
		
		double salario = 2500.00;
		
		System.out.println("O meu sal�rio � " + salario);
		
		// int valor = 12.5;       n�o compila.

        // int valor2 = 0.0;       n�o compila.

        double teste = 125.50;     // compila

        // int valor3 = teste;     n�o compila.
		
		double multiplicacao = 24.8 * 24;
		
		System.out.println(multiplicacao);
		
		int divisaoInt = 5 / 2; 
		
		System.out.println(divisaoInt);
		
		double divisao = 5.0 / 2;
		
		System.out.println(divisao);
		
	}
}

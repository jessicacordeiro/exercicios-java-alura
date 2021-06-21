import java.util.Scanner;

public class TesteIR {

	public static void main(String[] args) {
		
		System.out.println("----VERIFICA��O DO IR----");
		
		double salario;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o valor do seu sal�rio por favor: ");
			salario = ler.nextDouble();
		
		if (salario <= 1899.99) {
		    	System.out.println("O seu sal�rio no valor de R$ " + salario + " n�o entra na verifica��o do IR.");
		}
			
		else if (salario >= 1900.00 && salario <= 2800.00) {
			salario = salario - 142;
			System.out.println("o IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142, " 
					+ "sendo assim seu sal�rio final ser�: R$ " + salario);
		}
		
		else if (salario >= 2800.10 && salario <= 3751.00) {
	       salario = salario - 350;
	       System.out.println("A sua aliquota � de 15% e pode deduzir at� R$ 350, "
	       		+ "sendo assim seu sal�rio final ser�: R$ " + salario);
		} else {
	      salario = salario - 636;
	      System.out.println("A sua aliquota � de 22,5% e pode deduzir at� R$ 636, "
	    		  + "sendo assim seu sal�rio final ser�: R$ " + salario);
	    }
	  }
    }
 }


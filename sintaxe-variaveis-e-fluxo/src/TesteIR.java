import java.util.Scanner;

public class TesteIR {

	public static void main(String[] args) {
		
		System.out.println("----VERIFICAÇÃO DO IR----");
		
		double salario;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o valor do seu salário por favor: ");
			salario = ler.nextDouble();
		
		if (salario <= 1899.99) {
		    	System.out.println("O seu salário no valor de R$ " + salario + " não entra na verificação do IR.");
		}
			
		else if (salario >= 1900.00 && salario <= 2800.00) {
			salario = salario - 142;
			System.out.println("o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142, " 
					+ "sendo assim seu salário final será: R$ " + salario);
		}
		
		else if (salario >= 2800.10 && salario <= 3751.00) {
	       salario = salario - 350;
	       System.out.println("A sua aliquota é de 15% e pode deduzir até R$ 350, "
	       		+ "sendo assim seu salário final será: R$ " + salario);
		} else {
	      salario = salario - 636;
	      System.out.println("A sua aliquota é de 22,5% e pode deduzir até R$ 636, "
	    		  + "sendo assim seu salário final será: R$ " + salario);
	    }
	  }
    }
 }


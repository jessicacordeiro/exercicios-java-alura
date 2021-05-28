import java.util.Scanner;

public class TestaEscopo {
	
        public static void main(String[] args){

            System.out.println("testando condicionais");
    		
    		int idade, quantidadePessoas;
    		
    		try (Scanner ler = new Scanner(System.in)) {
    			System.out.println("Digite a sua idade, por favor: ");
    			idade = ler.nextInt();
    			System.out.println("Caso esteja acompanhado, digite o número de acompanhantes: ");
    			quantidadePessoas = ler.nextInt();
    			
    		boolean acompanhado;

            if (quantidadePessoas >= 1) {
                acompanhado = true;
            } else {
                acompanhado = false;
            }

            if (idade >=18 || acompanhado) {
                System.out.println("Seja bem vindo");       
            } else {
                System.out.println("infelizmente voce nao pode entrar");
        }
      }
   }
}
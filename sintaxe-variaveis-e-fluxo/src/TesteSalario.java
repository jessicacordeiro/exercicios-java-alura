
public class TesteSalario {

	public static void main(String[] args) {

		boolean foiPromovido = true;

		if(foiPromovido) {
			double salario = 4200.0;
	    } else {
	        double salario = 3800.0;
	    }
	      System.out.println(salario);
	    }
	
	// O c�digo nem compila, pois fora do bloco if/else a vari�vel salario n�o existe mais.
}

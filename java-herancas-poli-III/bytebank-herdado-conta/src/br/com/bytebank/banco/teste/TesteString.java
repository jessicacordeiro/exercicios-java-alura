package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "J�ssica"; // object literal
		String outro = new String("Alura"); // m� pr�tica, sempre prefere a sintaxe literal.
		
		System.out.println("\n------ M�TODO replace() ------\n");
		
		String novo1 = outro.replace("A", "a");
		System.out.println(novo1);
		
		System.out.println("\n------ M�TODO toLowerCase() ------\n");
		
		String novo2 = nome.toLowerCase(); // letras m�nusculas
		System.out.println(novo2);
		
		System.out.println("\n------ M�TODO toUpperCase() ------\n");
		
		String novo3 = nome.toUpperCase(); // letras m�nusculas
		System.out.println(novo3);
		
		System.out.println("\n------ M�TODO charAt() ------\n");
		
		char c = nome.charAt(3); //char i
		System.out.println(c);
		
		System.out.println("------ M�TODO indexOf() ------");
		
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		System.out.println("\n------ M�TODO substring() ------\n");
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		System.out.println("\n------ M�TODO lenght() ------\n");
		
		System.out.println(nome.length());
		
		System.out.println("\n------ M�TODO charAt() uma letra em baixo da outra ------\n");
		
		for(int i = 0; i< nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println("\n------ M�TODO Empty() & trim ------\n");
		
		String vazio1 = "";
		System.out.println(vazio1.isEmpty());
		
		String vazio2 = " ";
		String outroVazio = vazio2.trim();
		System.out.println(outroVazio.isEmpty());
	}
}

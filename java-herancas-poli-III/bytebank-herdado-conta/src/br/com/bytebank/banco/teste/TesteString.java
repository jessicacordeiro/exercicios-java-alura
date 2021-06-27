package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Jéssica"; // object literal
		String outro = new String("Alura"); // má prática, sempre prefere a sintaxe literal.
		
		System.out.println("\n------ MÉTODO replace() ------\n");
		
		String novo1 = outro.replace("A", "a");
		System.out.println(novo1);
		
		System.out.println("\n------ MÉTODO toLowerCase() ------\n");
		
		String novo2 = nome.toLowerCase(); // letras mínusculas
		System.out.println(novo2);
		
		System.out.println("\n------ MÉTODO toUpperCase() ------\n");
		
		String novo3 = nome.toUpperCase(); // letras mínusculas
		System.out.println(novo3);
		
		System.out.println("\n------ MÉTODO charAt() ------\n");
		
		char c = nome.charAt(3); //char i
		System.out.println(c);
		
		System.out.println("------ MÉTODO indexOf() ------");
		
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		System.out.println("\n------ MÉTODO substring() ------\n");
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		System.out.println("\n------ MÉTODO lenght() ------\n");
		
		System.out.println(nome.length());
		
		System.out.println("\n------ MÉTODO charAt() uma letra em baixo da outra ------\n");
		
		for(int i = 0; i< nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println("\n------ MÉTODO Empty() & trim ------\n");
		
		String vazio1 = "";
		System.out.println(vazio1.isEmpty());
		
		String vazio2 = " ";
		String outroVazio = vazio2.trim();
		System.out.println(outroVazio.isEmpty());
	}
}

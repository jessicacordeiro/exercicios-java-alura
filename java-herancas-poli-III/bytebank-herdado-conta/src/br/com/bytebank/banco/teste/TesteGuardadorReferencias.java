package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {
	
	public static void main(String[] args) {
		
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		 
		Conta cc = new ContaCorrente(1256, "12336-8");
		guardador.adiciona(cc);
		 
		Conta cc2 = new ContaCorrente(1256, "12563-8");
		guardador.adiciona(cc2);
		 
		int tamanho = guardador.getQuantDeElementos();
		System.out.println(tamanho);
		 
		/*Object ref = guardador.getPosicao(1);
		System.out.println(((Conta)ref).getNumero());*/
		
		Conta ref = (Conta) guardador.getPosicao(1);
		System.out.println(ref.getNumero());
		
	}

}

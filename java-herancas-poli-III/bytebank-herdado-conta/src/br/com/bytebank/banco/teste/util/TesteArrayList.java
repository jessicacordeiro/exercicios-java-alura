package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		// Generics
		List<Conta> lista = new LinkedList<Conta>();
		
		Conta cc = new ContaCorrente(1256, "12336-8");
		lista.add(cc);
		 
		Conta cc2 = new ContaCorrente(1256, "12563-8");
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta ref = (Conta) lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(0336, "12225-8");
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(0336, "122546");
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("--------------------");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}

	}

}

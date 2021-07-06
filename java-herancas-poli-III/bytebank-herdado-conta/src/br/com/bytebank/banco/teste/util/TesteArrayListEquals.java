package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		/*Conta cc1 = new ContaCorrente(1253, "12254-6");
		  Conta cc2 = new ContaCorrente(1253, "12254-6");
		  boolean igual = cc1.eIgual(cc2);
		  System.out.println(igual);*/
		
		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(1253, "12225-8");
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(1523, "12254-6");
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(1523, "12254-6");
		lista.add(cc2);
		
		boolean existe = lista.contains(cc3);
		System.out.println("Já existe essa conta? " + existe);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}

}

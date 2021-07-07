package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteComparatorNumber {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(0666, "12569-8");
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(0152, "12589-8");
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(1452, "13679-8");
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(0456, "44569-8");
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        System.out.println("\n-------------Método sem Comparator--------------\n");
        
        for (Conta conta : lista) {
			System.out.println(conta);
		}
        
        // NumeroDaAgenciaComparator comparator = new NumeroDaAgenciaComparator();  
        // lista.sort(new NumeroDaAgenciaComparator()); // método simplificado.
        lista.sort(null); // método natural.
        
        // Collections.sort(lista, new NumeroDaAgenciaComparator()); ---> Método alternativo.
        // Collections.reverse(lista); --> Lista em Ordem do Maior para o menor.
        // Collections.sort(lista); 
        
        System.out.println("\n-------------Método com Comparator-------------\n");
        
        for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}

class NumeroDaAgenciaComparator implements Comparator<Conta> {
	
	@Override
	public int compare(Conta c1, Conta c2) {
		
		return Integer.compare(c1.getAgencia(), c2.getAgencia());
		// return c1.getAgencia() - c2.getAgencia(); -- alternativa de solução.	
	}
}
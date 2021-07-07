package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteLambda {
	
	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(1158, "15261-9");
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Jaqueline Cordeiro");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(5889, "22569-9");
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme Souza");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(1158, "25698-9");
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo Silveira");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(2225,"23334-1");
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Anabelle Silva");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);
        
        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        lista.sort( (c1, c2) -> Integer.compare(c1.getAgencia(), c2.getAgencia()) );
        
        Comparator<Conta> comp = (Conta c1, Conta c2) -> {
        		String nomeC1 = c1.getTitular().getNome();
        		String nomeC2 = c2.getTitular().getNome();
        		return nomeC1.compareTo(nomeC2);	
        };
        
        System.out.println("\n-------------Método com Comparator-------------\n");
        
        lista.sort(comp);
        
        lista.forEach( (conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()) );
			
	}
}

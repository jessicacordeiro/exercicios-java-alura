package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
	
	public static void main(String[] args) {

        Object cc = new ContaCorrente(1263, "12562-6");
        Object cp = new ContaPoupanca(1136, "23669-9");

        System.out.println(cc);
        System.out.println(cp);
    }
}

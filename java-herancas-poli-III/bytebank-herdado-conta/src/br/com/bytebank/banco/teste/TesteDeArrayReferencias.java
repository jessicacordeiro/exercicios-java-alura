package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteDeArrayReferencias {
	
	public static void main(String[] args) {
		
		// alterando o tipo 
		Object[] referencias = new Object[5];
		
		System.out.println(referencias.length);
		
		ContaCorrente cc1 = new ContaCorrente(0065, "25698-8");
		referencias[0] = cc1;
		
		// cria instância de ContaPoupanca
		ContaPoupanca cc2 = new ContaPoupanca(0065, "25899-1");
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		// Object referenciaGenerica = contas[1];
		
		//System.out.println(cc2.getNumero());
		
		// System.out.println(referencias[0].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast.
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
	}

}

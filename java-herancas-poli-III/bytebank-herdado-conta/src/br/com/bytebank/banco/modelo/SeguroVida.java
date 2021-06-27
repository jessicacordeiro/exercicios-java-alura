package br.com.bytebank.banco.modelo;

public class SeguroVida implements Tributario {

	@Override
	public double getValorImposto() {
		return 42;
	}	
}

package com.wandson.boleto.bb;

import com.wandson.boleto.Boleto;

public class BBBoleto implements Boleto {

	@Override
	public void emitir() {
		System.out.println("Gerando boleto do Banco do Brasil.");
	}

}

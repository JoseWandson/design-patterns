package com.wandson.boleto.cef;

import com.wandson.boleto.Boleto;

public class CEFBoleto implements Boleto {

	@Override
	public void emitir() {
		System.out.println("Gerando boleto da Caixa.");
	}

}

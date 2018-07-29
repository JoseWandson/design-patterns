package com.wandson.venda;

import com.wandson.boleto.Boleto;
import com.wandson.nfe.NFe;

public class Venda {

	private NFe nFe;
	private Boleto boleto;

	public Venda(ModuloVendaFactory moduloVendaFactory) {
		this.nFe = moduloVendaFactory.criarNFe();
		this.boleto = moduloVendaFactory.criarBoleto();
	}

	public void realizar() {
		nFe.gerar();
		boleto.emitir();
	}

}

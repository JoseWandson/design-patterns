package com.wandson.venda;

import com.wandson.boleto.Boleto;
import com.wandson.nfe.NFe;

public interface ModuloVendaFactory {

	public NFe criarNFe();

	public Boleto criarBoleto();

}

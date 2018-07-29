package com.wandson;

import com.wandson.venda.LojaFactory;
import com.wandson.venda.ModuloVendaFactory;
import com.wandson.venda.Venda;

public class Principal {

	public static void main(String[] args) {
		ModuloVendaFactory moduloVendaFactory = new LojaFactory();
		Venda venda = new Venda(moduloVendaFactory);
		venda.realizar();
	}

}

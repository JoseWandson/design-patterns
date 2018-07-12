package com.wandson.builder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.wandson.notafiscal.NotaFiscal;
import com.wandson.notafiscal.NotaFiscalPF;
import com.wandson.notafiscal.NotaFiscalPJ;
import com.wandson.produto.Produto;

public class NotaFiscalBuilder {

	private NotaFiscal instancia;

	public NotaFiscalBuilder(boolean isPJ) {
		if (isPJ) {
			instancia = new NotaFiscalPJ();
		} else {
			instancia = new NotaFiscalPF();
		}
	}

	public NotaFiscal construir(Integer numero, String dataEmissao) {
		instancia.setNumero(numero);
		instancia.setDataEmissao(LocalDate.parse(dataEmissao, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		return instancia;
	}

	public NotaFiscalBuilder comItem(String nome, Integer quantidade, String valor) {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setQuantidade(quantidade);
		produto.setValor(new BigDecimal(valor));

		if (instancia.getItens() == null) {
			instancia.setItens(new ArrayList<>());
		}

		instancia.getItens().add(produto);

		return this;

	}

}

package com.wandson.notafiscal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.wandson.produto.Produto;

public abstract class NotaFiscal {

	private Integer numero;
	private LocalDate dataEmissao;
	private List<Produto> itens;

	public abstract BigDecimal calculoImposto();

	protected BigDecimal calculo(String porcentagem) {
		return getItens().stream().map(i -> i.getValor().multiply(new BigDecimal(i.getQuantidade())))
				.reduce(BigDecimal.ZERO, BigDecimal::add).multiply(new BigDecimal(porcentagem));
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public List<Produto> getItens() {
		return itens;
	}

	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}

}

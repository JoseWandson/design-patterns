package com.wandson.model;

import java.time.LocalDate;

public class Filme {

	private String nome;
	private LocalDate dataLancamento;
	private Boolean novo;

	public Filme(String nome, LocalDate dataLancamento) {
		this.nome = nome;
		this.dataLancamento = dataLancamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Boolean getNovo() {
		return novo;
	}

	public void setNovo(Boolean novo) {
		this.novo = novo;
	}

}

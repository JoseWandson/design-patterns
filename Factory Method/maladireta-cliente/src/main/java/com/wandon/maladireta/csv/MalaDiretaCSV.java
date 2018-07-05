package com.wandon.maladireta.csv;

import com.wandson.contato.Contatos;
import com.wandson.maladireta.MalaDireta;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MalaDiretaCSV extends MalaDireta {
	
	private String nomeArquivo;

	@Override
	protected Contatos criarContatos() {
		return new ContatosCSV(nomeArquivo);
	}

}

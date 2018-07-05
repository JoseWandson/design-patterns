package com.wandon.maladireta.xml;

import com.wandson.contato.Contatos;
import com.wandson.maladireta.MalaDireta;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MalaDiretaXML extends MalaDireta {

	private String nomeArquivo;

	@Override
	protected Contatos criarContatos() {
		return new ContatosXML(nomeArquivo);
	}

}
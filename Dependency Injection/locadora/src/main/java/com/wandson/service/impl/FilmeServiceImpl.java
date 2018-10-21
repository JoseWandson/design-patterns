package com.wandson.service.impl;

import javax.inject.Inject;

import com.wandson.model.Filme;
import com.wandson.repository.Filmes;
import com.wandson.service.DataFilme;
import com.wandson.service.FilmeService;

public class FilmeServiceImpl implements FilmeService {

	@Inject
	private Filmes filmes;

	@Inject
	private DataFilme dataFilme;

	@Override
	public void salvar(Filme filme) {
		filme.setNovo(dataFilme.isNovo(filme.getDataLancamento()));
		filmes.salvar(filme);
	}

}

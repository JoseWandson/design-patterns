package com.wandson.dao;

import com.wandson.model.Contato;

public interface Agendas {

	void inserir(Contato contato);

	Contato buscar(Integer codigo);

}

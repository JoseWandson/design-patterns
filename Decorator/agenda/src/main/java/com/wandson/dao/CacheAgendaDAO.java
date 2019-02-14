package com.wandson.dao;

import java.util.HashMap;
import java.util.Map;

import com.wandson.model.Contato;

public class CacheAgendaDAO implements Agendas {

	private Map<Integer, Contato> contatos;

	private AgendaDAO agendaDAO;

	public CacheAgendaDAO(AgendaDAO agendaDAO) {
		this.agendaDAO = agendaDAO;
		contatos = new HashMap<>();
	}

	public void inserir(Contato contato) {
		contatos.put(contato.getCodigo(), contato);
		agendaDAO.inserir(contato);
	}

	@Override
	public Contato buscar(Integer codigo) {
		if (contatos.containsKey(codigo)) {
			return contatos.get(codigo);
		}
		return agendaDAO.buscar(codigo);
	}
}
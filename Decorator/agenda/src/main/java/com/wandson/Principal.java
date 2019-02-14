package com.wandson;

import com.wandson.dao.AgendaDAO;
import com.wandson.dao.Agendas;
import com.wandson.dao.CacheAgendaDAO;
import com.wandson.model.Contato;

public class Principal {

	public static void main(String[] args) {
		Agendas agendas = new CacheAgendaDAO(new AgendaDAO());
		Contato contato1 = new Contato(1, "Wandson", "83 9 9999-9999");
		Contato contato2 = new Contato(2, "Teste", "83 9 8888-9999");

		agendas.inserir(contato1);
		agendas.inserir(contato2);

		System.out.println(agendas.buscar(1));
	}

}

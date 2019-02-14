package com.wandson.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.wandson.model.Contato;

import lombok.extern.java.Log;

@Log
public class AgendaDAO implements Agendas {

	public void inserir(Contato contato) {
		XStream xstream = criarXStream();
		try (OutputStream out = new FileOutputStream("src/main/resources/agenda.xml")) {
			List<Contato> contatos = buscarTodos();
			contatos.add(contato);
			xstream.toXML(contatos, out);
		} catch (IOException e) {
			log.severe(e.getMessage());
		}
	}

	public Contato buscar(Integer codigo) {
		List<Contato> contatos = buscarTodos();
		return contatos.stream().filter(c -> c.getCodigo() == codigo).findFirst().orElse(null);
	}

	@SuppressWarnings("unchecked")
	private List<Contato> buscarTodos() {
		try {
			XStream xstream = criarXStream();

			URL arquivo = this.getClass().getResource("/agenda.xml");
			return (List<Contato>) xstream.fromXML(arquivo);
		} catch (StreamException e) {
			return new ArrayList<>();
		}
	}

	private XStream criarXStream() {
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("contatos", List.class);
		xstream.alias("contato", Contato.class);
		return xstream;
	}

}

package com.wandson.repository.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.thoughtworks.xstream.XStream;
import com.wandson.model.Filme;
import com.wandson.repository.Filmes;
import com.wandson.service.MyOwnRuntimeException;

public class XMLFilmesRepository implements Filmes {

	@Override
	public void salvar(Filme filme) {
		XStream xstream = new XStream();
		xstream.alias("filme", Filme.class);
		OutputStream out = null;
		try {
			out = new FileOutputStream(filme.getNome() + ".xml");
			xstream.toXML(filme, out);
		} catch (FileNotFoundException e) {
			throw new MyOwnRuntimeException("Erro salvando arquivo", e);
		}
	}

}

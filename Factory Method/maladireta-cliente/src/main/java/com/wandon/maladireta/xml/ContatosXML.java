package com.wandon.maladireta.xml;

import java.net.URL;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.wandson.contato.Contato;
import com.wandson.contato.Contatos;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ContatosXML implements Contatos {
	
	private String nomeArquivo;

	@Override
	@SuppressWarnings("unchecked")
	public List<Contato> todos() {
		XStream xstream = new XStream();
	    xstream.alias("contatos", List.class);
	    xstream.alias("contato", Contato.class);
	    
	    URL arquivo = this.getClass().getResource("/" + nomeArquivo);
	    return (List<Contato>) xstream.fromXML(arquivo);
	}

}
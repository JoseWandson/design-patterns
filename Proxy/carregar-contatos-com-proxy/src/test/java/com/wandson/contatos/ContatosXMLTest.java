package com.wandson.contatos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.wandson.repository.Contatos;

class ContatosXMLTest {

	@Test
	public void deveRetornarContato() {
		Contatos contatos = new ContatosXMLProxy("contatos1.xml", "contatos2.xml");
		String nome = contatos.buscarPor("jose@email.com");
		assertEquals("José Santos", nome);
	}

}

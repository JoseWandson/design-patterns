package com.wandson.email;

import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.wandson.service.EnviadorEmail;

public class EnviadorEmailProxy implements EnviadorEmail {

	private List<String> emails;
	List<String> listaNegraEmails;

	@SuppressWarnings("unchecked")
	public EnviadorEmailProxy(String listaEmails, String listaNegra) {
		XStream xstream = new XStream();
		xstream.alias("emails", List.class);
		xstream.alias("email", String.class);

		emails = (List<String>) xstream.fromXML(this.getClass().getResource("/" + listaEmails));
		listaNegraEmails = (List<String>) xstream.fromXML(this.getClass().getResource("/" + listaNegra));
	}

	@Override
	public void enviar(String mensagem) {
		emails.removeAll(listaNegraEmails);
		EnviadorEmail enviadorEmail = new EnviadorEmailMandrill(emails);
		enviadorEmail.enviar(mensagem);
	}

}

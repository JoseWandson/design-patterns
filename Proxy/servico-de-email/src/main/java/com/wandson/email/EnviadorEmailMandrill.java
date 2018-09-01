package com.wandson.email;

import java.util.List;

import com.wandson.service.EnviadorEmail;

public class EnviadorEmailMandrill implements EnviadorEmail {

	private List<String> listaEmails;

	public EnviadorEmailMandrill(List<String> emails) {
		listaEmails = emails;
	}

	@Override
	public void enviar(String mensagem) {
		System.out.println("Iniciando o envio de e-mail");
		for (String email : listaEmails) {
			System.out.println("Enviando o e-mail para: " + email);
			System.out.println("Mensagem: " + mensagem);
		}
		System.out.println("Finalizando o envio de e-mail");
	}

}

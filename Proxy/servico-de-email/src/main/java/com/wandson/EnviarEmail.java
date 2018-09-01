package com.wandson;

import com.wandson.email.EnviadorEmailProxy;
import com.wandson.service.EnviadorEmail;

public class EnviarEmail {

	public static void main(String[] args) {
		EnviadorEmail enviadorEmail = new EnviadorEmailProxy("lista-emails.xml", "lista-negra.xml");
		enviadorEmail.enviar("Bem vindo!");
	}

}

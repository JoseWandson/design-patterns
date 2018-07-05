package com.wandon;

import javax.swing.JOptionPane;

import com.wandon.maladireta.xml.MalaDiretaXML;
import com.wandson.maladireta.MalaDireta;

public class NovoClienteCadastrado {

	public static void main(String[] args) {
		MalaDireta malaDireta = new MalaDiretaXML("contatos.xml");
		String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem de novo cliente:");
		boolean status = malaDireta.enviarEmail(mensagem);
		JOptionPane.showMessageDialog(null, "E-mails enviados: " + status);
	}

}

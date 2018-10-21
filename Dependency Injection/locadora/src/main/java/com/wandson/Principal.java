package com.wandson;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import com.wandson.model.Filme;
import com.wandson.service.FilmeService;
import com.wandson.util.cdi.WeldContext;

public class Principal {

	public static void main(String[] args) {
		FilmeService filmeService = WeldContext.INSTANCE.getBean(FilmeService.class);

		String nome = JOptionPane.showInputDialog("Digite o nome do filme");
		String data = JOptionPane.showInputDialog("Digite a data de lançamento(dd/MM/yyyy)");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataLancamento = LocalDate.parse(data, formatter);

		Filme filme = new Filme(nome, dataLancamento);

		filmeService.salvar(filme);
	}

}

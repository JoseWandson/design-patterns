package com.wandson.logs.txt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;

import com.wandson.log.LogPrinter;

public class LogPrinterTXT implements LogPrinter {

	private String nomeArquivo;

	public LogPrinterTXT(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	public void print(String message) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/" + nomeArquivo, true))) {
			writer.write(LocalDateTime.now().toString());
			writer.newLine();
			writer.write(message);
			writer.newLine();
		} catch (Exception e) {
			throw new RuntimeException("Erro salvando arquivo txt", e);
		}
	}

}

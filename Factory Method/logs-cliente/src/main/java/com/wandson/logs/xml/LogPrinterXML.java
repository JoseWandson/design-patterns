package com.wandson.logs.xml;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.wandson.log.Log;
import com.wandson.log.LogPrinter;

public class LogPrinterXML implements LogPrinter {

	private String nomeArquivo;

	public LogPrinterXML(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	public void print(String message) {
		XStream xStream = new XStream(new DomDriver());
		xStream.alias("log", Log.class);

		Log log = new Log(LocalDateTime.now(), message);

		try (OutputStream os = new FileOutputStream("src/main/resources/" + nomeArquivo)) {
			xStream.toXML(log, os);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new LogPrinterXML("teste.xml").print("teste");
	}

}

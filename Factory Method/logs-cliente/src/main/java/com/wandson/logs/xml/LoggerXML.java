package com.wandson.logs.xml;

import com.wandson.log.LogPrinter;
import com.wandson.logs.Logger;

public class LoggerXML extends Logger {
	
	private String nomeArquivo;
	
	public LoggerXML(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	protected LogPrinter createLogger() {
		return new LogPrinterXML(nomeArquivo);
	}

}

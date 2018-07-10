package com.wandson.logs.txt;

import com.wandson.log.LogPrinter;
import com.wandson.logs.Logger;

public class LoggerTXT extends Logger {
	
	private String nomeArquivo;
	
	public LoggerTXT(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	protected LogPrinter createLogger() {
		return new LogPrinterTXT(nomeArquivo);
	}

}

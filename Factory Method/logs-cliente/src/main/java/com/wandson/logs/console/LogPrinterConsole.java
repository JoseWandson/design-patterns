package com.wandson.logs.console;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import com.wandson.log.LogPrinter;

public class LogPrinterConsole implements LogPrinter {

	private Level level;

	public LogPrinterConsole(Level level) {
		this.level = level;
	}

	@Override
	public void print(String message) {
		Logger logger = System.getLogger(LogPrinterConsole.class.getName());
		logger.log(level, message);
	}

}

package com.wandson.logs.console;

import java.lang.System.Logger.Level;

import com.wandson.log.LogPrinter;
import com.wandson.logs.Logger;

public class LoggerConsole extends Logger {

	private Level level;

	public LoggerConsole(Level level) {
		this.level = level;
	}

	@Override
	protected LogPrinter createLogger() {
		return new LogPrinterConsole(level);
	}

}

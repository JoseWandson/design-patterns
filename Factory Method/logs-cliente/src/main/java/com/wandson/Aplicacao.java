package com.wandson;

import java.lang.System.Logger.Level;

import com.wandson.logs.console.LoggerConsole;
import com.wandson.logs.txt.LoggerTXT;
import com.wandson.logs.xml.LoggerXML;

public class Aplicacao {

	public static void main(String[] args) {
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos(new LoggerConsole(Level.INFO));
		calculadoraDeImpostos.calcular(100);

		calculadoraDeImpostos = new CalculadoraDeImpostos(new LoggerTXT("arquivo.txt"));
		calculadoraDeImpostos.calcular(100);

		calculadoraDeImpostos = new CalculadoraDeImpostos(new LoggerXML("arquivo.xml"));
		calculadoraDeImpostos.calcular(100);
	}

}

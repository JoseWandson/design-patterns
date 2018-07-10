package com.wandson;

import com.wandson.logs.Logger;

public class CalculadoraDeImpostos {

	private Logger logger;

	public CalculadoraDeImpostos(Logger logger) {
		this.logger = logger;
	}

	public void calcular(double valor) {
		valor = valor - valor * 0.1;
		logger.log("Imposto calculado para o valor R$" + valor);
	}

}

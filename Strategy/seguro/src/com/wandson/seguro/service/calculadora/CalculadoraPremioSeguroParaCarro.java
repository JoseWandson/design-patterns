package com.wandson.seguro.service.calculadora;

import com.wandson.seguro.model.Cliente;
import com.wandson.seguro.service.CalculadoraPremioSeguro;

public class CalculadoraPremioSeguroParaCarro implements CalculadoraPremioSeguro {

	@Override
	public double calcular(Cliente cliente, double valorVeiculo) {
		return valorVeiculo * 0.07 - cliente.getIdade() * 15;
	}

}

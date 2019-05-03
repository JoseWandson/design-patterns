package com.wandson.seguro.service.calculadora;

import com.wandson.seguro.model.Cliente;
import com.wandson.seguro.service.CalculadoraPremioSeguro;

public class CalculadoraPremioSeguroParaMoto implements CalculadoraPremioSeguro {

	@Override
	public double calcular(Cliente cliente, double valorVeiculo) {
		return valorVeiculo * 0.15 - cliente.getIdade() * 7;
	}

}

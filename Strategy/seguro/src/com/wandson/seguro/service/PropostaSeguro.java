package com.wandson.seguro.service;

import com.wandson.seguro.model.Cliente;

public class PropostaSeguro {

	private Cliente cliente;
	private CalculadoraPremioSeguro calculadora;
	private double valorVeiculo;

	public PropostaSeguro() {
	}

	public String gerar() {
		return "O valor de prêmio é: " + calculadora.calcular(cliente, valorVeiculo);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public CalculadoraPremioSeguro getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(CalculadoraPremioSeguro calculadora) {
		this.calculadora = calculadora;
	}

	public void setValorVeiculo(double valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}

}

package com.wandson.seguro.service;

import com.wandson.seguro.model.Cliente;

public interface CalculadoraPremioSeguro {

	double calcular(Cliente cliente, double valorVeiculo);

}

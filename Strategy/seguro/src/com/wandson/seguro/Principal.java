package com.wandson.seguro;

import java.util.Scanner;

import com.wandson.seguro.model.Cliente;
import com.wandson.seguro.model.Sexo;
import com.wandson.seguro.service.CalculadoraPremioSeguro;
import com.wandson.seguro.service.PropostaSeguro;
import com.wandson.seguro.service.calculadora.CalculadoraPremioSeguroParaCarro;
import com.wandson.seguro.service.calculadora.CalculadoraPremioSeguroParaMoto;

public class Principal {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			Cliente cliente = new Cliente();
			System.out.println("Digite o seu nome: ");
			cliente.setNome(entrada.nextLine());
			System.out.println("Digite a sua idade: ");
			cliente.setIdade(entrada.nextInt());
			System.out.println("Digite o seu sexo(M ou F): ");
			String sexo = entrada.next();
			cliente.setSexo(sexo.equals("M") ? Sexo.MASCULINO : Sexo.FEMININO);
			PropostaSeguro proposta = new PropostaSeguro();
			proposta.setCliente(cliente);
			boolean continuar = true;
			while (continuar) {
				System.out.println("Digite o tipo do veículo");
				System.out.println("1 - Moto");
				System.out.println("2 - Carro");
				System.out.println("3 - Sair");
				CalculadoraPremioSeguro calculadoraPremioSeguro;
				switch (entrada.nextInt()) {
				case 1:
					calculadoraPremioSeguro = new CalculadoraPremioSeguroParaMoto();
					break;
				case 2:
					calculadoraPremioSeguro = new CalculadoraPremioSeguroParaCarro();
					break;
				default:
					continuar = false;
					continue;
				}
				System.out.println("Digite o valor do veículo: ");
				proposta.setCalculadora(calculadoraPremioSeguro);
				proposta.setValorVeiculo(entrada.nextDouble());
				System.out.println(proposta.gerar());
			}
		}
	}

}

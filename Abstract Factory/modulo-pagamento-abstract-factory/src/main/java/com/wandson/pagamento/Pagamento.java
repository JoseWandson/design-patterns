package com.wandson.pagamento;

import java.math.BigDecimal;

import com.wandson.gestorderisco.AlertaDeRiscoException;
import com.wandson.gestorderisco.GestorDeRisco;
import com.wandson.operadora.CapturaNaoAutorizadaException;
import com.wandson.operadora.Operadora;

public class Pagamento {

	private Operadora operadora;
	private GestorDeRisco gestorDeRisco;

	public Pagamento(ModuloPagamentoFactory moduloPagamentoFactory) {
		operadora = moduloPagamentoFactory.criarOperadora();
		gestorDeRisco = moduloPagamentoFactory.criarGestorDeRisco();
	}

	public Long autorizar(String cartao, BigDecimal valor)
			throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		operadora.capturar(cartao, valor);
		gestorDeRisco.avaliarRisco(cartao, valor);
		return operadora.confirmar();
	}

}

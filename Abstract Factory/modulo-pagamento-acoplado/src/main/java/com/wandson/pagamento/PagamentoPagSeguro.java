package com.wandson.pagamento;

import java.math.BigDecimal;

import com.wandson.gestorderisco.AlertaDeRiscoException;
import com.wandson.gestorderisco.FControl;
import com.wandson.operadora.CapturaNaoAutorizadaException;
import com.wandson.operadora.Cielo;

public class PagamentoPagSeguro {
	
	private Cielo operadora;
	private FControl gestorDeRisco;

	public PagamentoPagSeguro(Cielo operadora, FControl gestorDeRisco) {
	    this.operadora = operadora;
	    this.gestorDeRisco = gestorDeRisco;
    }

	public Long autorizar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		this.operadora.capturar(cartao, valor);
		this.gestorDeRisco.avaliarRisco(cartao, valor);
		return this.operadora.confirmar();
    }

}

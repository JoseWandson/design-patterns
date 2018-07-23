package com.wandson.operadora.redecard;

import java.math.BigDecimal;

import com.wandson.operadora.CapturaNaoAutorizadaException;
import com.wandson.operadora.Operadora;

public class RedeCard implements Operadora {

	private Long codigoConfirmacao = -1L;

	@Override
	public void capturar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException {
		if (cartao.startsWith("2222") && valorMaiorQueLimite(valor)) {
			throw new CapturaNaoAutorizadaException("Valor maior que limite para cartão informado.");
		}
		codigoConfirmacao = (long) (Math.random() * 300);
	}

	@Override
	public Long confirmar() {
		System.out.println("Fazendo o débito na conta do cliente via Redecard");
		return codigoConfirmacao;
	}

	private boolean valorMaiorQueLimite(BigDecimal valor) {
		BigDecimal limite = new BigDecimal("1000");
		return valor.compareTo(limite) > 0;
	}

}

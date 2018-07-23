package com.wandson.gestorderisco.clearsale;

import java.math.BigDecimal;

import com.wandson.gestorderisco.AlertaDeRiscoException;
import com.wandson.gestorderisco.GestorDeRisco;

public class ClearSale implements GestorDeRisco {

	@Override
	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException {
		if (cartao.startsWith("1111") && valorMuitoAlto(valor)) {
			throw new AlertaDeRiscoException("Valor muito alto para esse cartão");
		}
	}

	private boolean valorMuitoAlto(BigDecimal valor) {
		BigDecimal limite = new BigDecimal("5000");
		return limite.compareTo(valor) < 0;
	}

}

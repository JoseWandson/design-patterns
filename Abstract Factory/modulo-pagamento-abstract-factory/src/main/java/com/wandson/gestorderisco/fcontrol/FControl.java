package com.wandson.gestorderisco.fcontrol;

import java.math.BigDecimal;

import com.wandson.gestorderisco.AlertaDeRiscoException;
import com.wandson.gestorderisco.GestorDeRisco;

public class FControl implements GestorDeRisco {

	@Override
	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException {
		if (cartao.startsWith("7777")) {
			throw new AlertaDeRiscoException("Cartão suspeito.");
		}
	}

}

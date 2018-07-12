package com.wandson.notafiscal;

import java.math.BigDecimal;

public class NotaFiscalPJ extends NotaFiscal {

	@Override
	public BigDecimal calculoImposto() {
		return calculo("0.04");
	}

}

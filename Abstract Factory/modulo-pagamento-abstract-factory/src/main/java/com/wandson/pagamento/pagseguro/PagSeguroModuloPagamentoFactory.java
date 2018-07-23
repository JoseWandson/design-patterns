package com.wandson.pagamento.pagseguro;

import com.wandson.gestorderisco.GestorDeRisco;
import com.wandson.gestorderisco.fcontrol.FControl;
import com.wandson.operadora.Operadora;
import com.wandson.operadora.cielo.Cielo;
import com.wandson.pagamento.ModuloPagamentoFactory;

public class PagSeguroModuloPagamentoFactory implements ModuloPagamentoFactory {

	@Override
	public Operadora criarOperadora() {
		return new Cielo();
	}

	@Override
	public GestorDeRisco criarGestorDeRisco() {
		return new FControl();
	}

}

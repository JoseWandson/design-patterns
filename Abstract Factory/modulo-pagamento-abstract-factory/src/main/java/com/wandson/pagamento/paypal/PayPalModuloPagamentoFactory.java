package com.wandson.pagamento.paypal;

import com.wandson.gestorderisco.GestorDeRisco;
import com.wandson.gestorderisco.clearsale.ClearSale;
import com.wandson.operadora.Operadora;
import com.wandson.operadora.redecard.RedeCard;
import com.wandson.pagamento.ModuloPagamentoFactory;

public class PayPalModuloPagamentoFactory implements ModuloPagamentoFactory {

	@Override
	public Operadora criarOperadora() {
		return new RedeCard();
	}

	@Override
	public GestorDeRisco criarGestorDeRisco() {
		return new ClearSale();
	}

}

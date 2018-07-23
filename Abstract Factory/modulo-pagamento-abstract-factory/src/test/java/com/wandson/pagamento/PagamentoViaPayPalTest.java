package com.wandson.pagamento;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wandson.gestorderisco.AlertaDeRiscoException;
import com.wandson.operadora.CapturaNaoAutorizadaException;
import com.wandson.pagamento.paypal.PayPalModuloPagamentoFactory;

public class PagamentoViaPayPalTest {

	private Pagamento pagamento;

	@BeforeEach
	public void init() {
		ModuloPagamentoFactory moduloPagamentoFactory = new PayPalModuloPagamentoFactory();
		pagamento = new Pagamento(moduloPagamentoFactory);
	}

	@Test
	public void deveAutorizarVenda() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		Long codigoAutorizacao = pagamento.autorizar("2222.2222", new BigDecimal("200"));
		assertNotNull(codigoAutorizacao);
	}

	@Test
	public void deveNegarCaptura_valorAcimaDoLimiteParaCartao()
			throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		assertThrows(CapturaNaoAutorizadaException.class,
				() -> pagamento.autorizar("2222.2222", new BigDecimal("2000")));
	}

	@Test
	public void deveAutorizarVenda_valorAltoComCartaoValido()
			throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		Long codigoAutorizacao = pagamento.autorizar("3333.2222", new BigDecimal("2000"));
		assertNotNull(codigoAutorizacao);
	}

	@Test
	public void deveGerarAlertaDeRisco() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
		assertThrows(AlertaDeRiscoException.class, () -> pagamento.autorizar("1111.2222", new BigDecimal("5500")));
	}

}

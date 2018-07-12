package com.wandson.notafiscal;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wandson.builder.NotaFiscalBuilder;

public class NotaFiscalTest {

	@Test
	public void testCalculoImpostoNFPF() {
		NotaFiscal notaFiscal = new NotaFiscalBuilder(false).comItem("Sabonete", 2, "3").construir(123, "12/07/2018");

		assertEquals(0.42, notaFiscal.calculoImposto().doubleValue(), 0.001);
	}

	@Test
	public void testCalculoImpostoNFPFComDoisItens() {
		NotaFiscal notaFiscal = new NotaFiscalBuilder(false).comItem("Caderno", 1, "20").comItem("Mochila", 1, "150")
				.construir(123, "12/07/2018");

		assertEquals(11.9, notaFiscal.calculoImposto().doubleValue(), 0.001);
	}

	@Test
	public void testCalculoImpostoNFPJ() {
		NotaFiscal notaFiscal = new NotaFiscalBuilder(true).comItem("Sabonete", 2, "3").construir(123, "12/07/2018");

		assertEquals(0.24, notaFiscal.calculoImposto().doubleValue(), 0.001);
	}

	@Test
	public void testCalculoImpostoNFPJComDoisItens() {
		NotaFiscal notaFiscal = new NotaFiscalBuilder(true).comItem("Caderno", 1, "20").comItem("Mochila", 1, "150")
				.construir(123, "12/07/2018");

		assertEquals(6.8, notaFiscal.calculoImposto().doubleValue(), 0.001);
	}

}

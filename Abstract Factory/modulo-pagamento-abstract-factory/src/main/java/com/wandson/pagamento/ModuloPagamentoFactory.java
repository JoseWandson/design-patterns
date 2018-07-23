package com.wandson.pagamento;

import com.wandson.gestorderisco.GestorDeRisco;
import com.wandson.operadora.Operadora;

public interface ModuloPagamentoFactory {

	public Operadora criarOperadora();

	public GestorDeRisco criarGestorDeRisco();

}

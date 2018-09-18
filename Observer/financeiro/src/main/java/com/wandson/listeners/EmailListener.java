package com.wandson.listeners;

import java.util.List;

import com.wandson.model.Lancamento;
import com.wandson.notifier.Notificador;

public class EmailListener implements Listener {

	private Notificador notificador;

	public EmailListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
	}

	@Override
	public void atualizar() {
		List<Lancamento> lancamentosVencidos = notificador.getLancamentosVencidos();
		
		for (Lancamento lancamento : lancamentosVencidos) {
			System.out.println("Enviando e-mail para " + lancamento.getPessoa().getEmail());
		}
	}

}

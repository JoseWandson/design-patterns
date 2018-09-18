package com.wandson.listeners;

import java.util.List;

import com.wandson.model.Lancamento;
import com.wandson.notifier.Notificador;

public class SMSListener implements Listener {

	private Notificador notificador;

	public SMSListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
	}

	@Override
	public void atualizar() {
		List<Lancamento> lancamentosVencidos = notificador.getLancamentosVencidos();
		
		for (Lancamento lancamento : lancamentosVencidos) {
			System.out.println("Enviando SMS para " + lancamento.getPessoa().getTelefone());
		}
	}

}

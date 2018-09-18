package com.wandson.notifier;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.wandson.listeners.Listener;
import com.wandson.model.Lancamento;

public class NotificadorLancamentosVencidos implements Notificador {

	private Set<Listener> listeners;
	List<Lancamento> lancamentosVencidos;

	public NotificadorLancamentosVencidos() {
		listeners = new HashSet<>();
	}

	@Override
	public void registrarListener(Listener listener) {
		listeners.add(listener);
	}

	@Override
	public void removerListener(Listener listener) {
		listeners.remove(listener);
	}

	@Override
	public void notificarListeners() {
		listeners.forEach(l -> l.atualizar());
	}

	@Override
	public void novosLancamentosVencidos(List<Lancamento> lancamentosVencidos) {
		this.lancamentosVencidos = lancamentosVencidos;
		notificarListeners();
	}

	@Override
	public List<Lancamento> getLancamentosVencidos() {
		return lancamentosVencidos;
	}

}

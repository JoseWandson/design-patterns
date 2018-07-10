package com.wandson.log;

import java.time.LocalDateTime;

public class Log {

	private LocalDateTime data;
	private String mensagem;

	public Log(LocalDateTime data, String mensagem) {
		this.data = data;
		this.mensagem = mensagem;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}

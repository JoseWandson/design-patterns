package com.wandson.seguro.model;

public enum Sexo {

	MASCULINO(1), FEMININO(0);

	private int sexo;

	private Sexo(int sexo) {
		this.sexo = sexo;
	}

	public int getSexo() {
		return sexo;
	}

}

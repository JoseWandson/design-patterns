package com.wandson.service.impl;

import java.time.LocalDate;
import java.time.Period;

import com.wandson.service.DataFilme;

public class DataFilmeImpl implements DataFilme {

	@Override
	public Boolean isNovo(LocalDate data) {
		LocalDate dataAtual = LocalDate.now();
		Period period = Period.between(data, dataAtual);
		return period.getMonths() <= 3;
	}

}

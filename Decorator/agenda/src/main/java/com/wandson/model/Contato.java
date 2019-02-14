package com.wandson.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Contato {

	private Integer codigo;
	private String nome;
	private String telefone;

}

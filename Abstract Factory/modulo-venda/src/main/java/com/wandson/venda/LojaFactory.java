package com.wandson.venda;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import com.wandson.boleto.Boleto;
import com.wandson.nfe.NFe;

public class LojaFactory implements ModuloVendaFactory {

	@Override
	public NFe criarNFe() {
		try {
			return (NFe) criar("nfe");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Boleto criarBoleto() {
		try {
			return (Boleto) criar("boleto");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private Object criar(String objeto)
			throws IOException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		Properties properties = new Properties();
		properties.load(this.getClass().getResourceAsStream("/config.properties"));
		String classe = properties.getProperty(objeto);
		return Class.forName(classe).getDeclaredConstructor().newInstance();
	}

}

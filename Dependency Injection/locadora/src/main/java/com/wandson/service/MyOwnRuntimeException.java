package com.wandson.service;

public class MyOwnRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MyOwnRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

}

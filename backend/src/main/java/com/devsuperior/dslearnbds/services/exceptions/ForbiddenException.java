package com.devsuperior.dslearnbds.services.exceptions;
//retorna erro 403
public class ForbiddenException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ForbiddenException(String msg) {
		super(msg);
	}
}

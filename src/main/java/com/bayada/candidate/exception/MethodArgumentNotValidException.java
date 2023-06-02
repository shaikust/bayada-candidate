package com.bayada.candidate.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class MethodArgumentNotValidException extends RuntimeException {
	private static final long serialVersionUID = 1;

	public MethodArgumentNotValidException(String message) {
		super(message);
	}
}

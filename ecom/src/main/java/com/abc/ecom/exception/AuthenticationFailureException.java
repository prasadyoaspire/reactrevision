package com.abc.ecom.exception;

public class AuthenticationFailureException extends RuntimeException {

	public AuthenticationFailureException(String msg) {
		super(msg);
	}
}

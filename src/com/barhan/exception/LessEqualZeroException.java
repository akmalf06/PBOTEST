package com.barhan.exception;

public class LessEqualZeroException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LessEqualZeroException(String errorMessage) {
		super(errorMessage);
	}
}

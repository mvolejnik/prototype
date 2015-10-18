package com.github.mvolejnik.cloud.webapp;

public class CloudAppException extends Exception {

	public CloudAppException() {
	}

	public CloudAppException(String message) {
		super(message);
	}

	public CloudAppException(Throwable cause) {
		super(cause);
	}

	public CloudAppException(String message, Throwable cause) {
		super(message, cause);
	}

	public CloudAppException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

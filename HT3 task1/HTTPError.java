package ht3task1;

public enum HTTPError {
	ERROR_400("Bad_Request"), ERROR_401("Unauthorized"), 
	ERROR_402("Payment Required"), ERROR_403("Forbidden"),
	ERROR_404("Not Found");

	private final String errorDescription;

	HTTPError(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public String toString() {
		return errorDescription;
	}
}

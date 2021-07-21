package chap10_home;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
}
}
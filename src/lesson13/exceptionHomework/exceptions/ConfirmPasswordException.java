package lesson13.exceptionHomework.exceptions;

public class ConfirmPasswordException extends Exception {
    public ConfirmPasswordException() {
        super();
    }
    public ConfirmPasswordException(String message) {
        super(message);
    }
}

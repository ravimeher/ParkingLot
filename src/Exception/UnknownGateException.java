package Exception;

public class UnknownGateException extends RuntimeException{
    public UnknownGateException() {
        super();
    }

    public UnknownGateException(String message) {
        super(message);
    }

    public UnknownGateException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownGateException(Throwable cause) {
        super(cause);
    }

    protected UnknownGateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

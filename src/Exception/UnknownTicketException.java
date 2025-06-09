package Exception;

public class UnknownTicketException extends RuntimeException {
    public UnknownTicketException() {
        super();
    }

    public UnknownTicketException(String ticketNotFound) {
    }

    public UnknownTicketException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownTicketException(Throwable cause) {
        super(cause);
    }

    protected UnknownTicketException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

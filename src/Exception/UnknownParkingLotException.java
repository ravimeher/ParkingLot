package Exception;

public class UnknownParkingLotException extends RuntimeException{
    public UnknownParkingLotException() {
        super();
    }

    public UnknownParkingLotException(Throwable cause) {
        super(cause);
    }

    public UnknownParkingLotException(String message) {
        super(message);
    }

    public UnknownParkingLotException(String message, Throwable cause) {
        super(message, cause);
    }

    protected UnknownParkingLotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

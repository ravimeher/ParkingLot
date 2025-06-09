package Exception;

public class UnknownParkingFloorException extends RuntimeException {
    public UnknownParkingFloorException() {
        super();
    }

    public UnknownParkingFloorException(String message) {
        super(message);
    }

    public UnknownParkingFloorException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownParkingFloorException(Throwable cause) {
        super(cause);
    }

    protected UnknownParkingFloorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

package Exception;

public class UnknownParkingSpotException extends RuntimeException {
    public UnknownParkingSpotException() {
        super();
    }

    public UnknownParkingSpotException(String parkingLotNotFound) {
    }

    public UnknownParkingSpotException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownParkingSpotException(Throwable cause) {
        super(cause);
    }

    protected UnknownParkingSpotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

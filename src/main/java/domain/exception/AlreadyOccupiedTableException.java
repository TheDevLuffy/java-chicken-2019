package domain.exception;

public class AlreadyOccupiedTableException extends RuntimeException {
    public AlreadyOccupiedTableException() {
        super();
    }

    public AlreadyOccupiedTableException(final String message) {
        super(message);
    }

    public AlreadyOccupiedTableException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public AlreadyOccupiedTableException(final Throwable cause) {
        super(cause);
    }

    protected AlreadyOccupiedTableException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

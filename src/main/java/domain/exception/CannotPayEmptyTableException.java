package domain.exception;

public class CannotPayEmptyTableException extends RuntimeException {
    public CannotPayEmptyTableException() {
        super();
    }

    public CannotPayEmptyTableException(final String message) {
        super(message);
    }

    public CannotPayEmptyTableException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public CannotPayEmptyTableException(final Throwable cause) {
        super(cause);
    }

    protected CannotPayEmptyTableException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

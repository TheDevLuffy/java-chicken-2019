package domain.exception;

public class NotFoundMenuException extends RuntimeException {
    public NotFoundMenuException() {
        super();
    }

    public NotFoundMenuException(final String message) {
        super(message);
    }

    public NotFoundMenuException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public NotFoundMenuException(final Throwable cause) {
        super(cause);
    }

    protected NotFoundMenuException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

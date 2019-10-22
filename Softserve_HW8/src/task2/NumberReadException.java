package task2;

import java.io.IOException;

public class NumberReadException extends IOException {
    public NumberReadException() {
    }

    public NumberReadException(String message) {
        super(message);
    }

}

package com.chaos.exceptions;

/**
 * @author WongYut
 */
public class NetworkException extends RuntimeException{
    public NetworkException() {
    }

    public NetworkException(String message) {
        super(message);
    }

    public NetworkException(Throwable cause) {
        super(cause);
    }
}

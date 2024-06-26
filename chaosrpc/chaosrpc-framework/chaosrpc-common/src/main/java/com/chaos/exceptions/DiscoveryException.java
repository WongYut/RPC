package com.chaos.exceptions;

/**
 * @author WongYut
 */
public class DiscoveryException extends RuntimeException{

    public DiscoveryException() {
    }

    public DiscoveryException(String message) {
        super(message);
    }

    public DiscoveryException(Throwable cause) {
        super(cause);
    }
}

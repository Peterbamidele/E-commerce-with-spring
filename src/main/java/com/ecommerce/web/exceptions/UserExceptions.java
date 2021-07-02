package com.ecommerce.web.exceptions;

public class UserExceptions extends Exception{
    public UserExceptions() {
    }

    public UserExceptions(String message) {
        super(message);
    }

    public UserExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public UserExceptions(Throwable cause) {
        super(cause);
    }
}

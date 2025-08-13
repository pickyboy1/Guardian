package com.pickyboy.guardian.exception;

public class RejectException extends GuardianException{
    public RejectException(String message) {
        super(message);
    }
    public RejectException(String message, Throwable cause) {
        super(message, cause);
    }
}

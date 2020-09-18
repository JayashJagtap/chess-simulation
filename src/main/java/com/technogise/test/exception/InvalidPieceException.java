package com.technogise.test.exception;

public class InvalidPieceException extends RuntimeException {

    public InvalidPieceException(String msg) {
        super(msg);
    }
}

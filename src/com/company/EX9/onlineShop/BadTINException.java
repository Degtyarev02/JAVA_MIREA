package com.company.EX9.onlineShop;

public class BadTINException extends IllegalArgumentException {
    public BadTINException(String message, Throwable err) {
        super(message, err);
    }
}

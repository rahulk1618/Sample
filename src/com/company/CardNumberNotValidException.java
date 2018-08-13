package com.company;

import java.util.concurrent.CancellationException;

public class CardNumberNotValidException extends Exception {
    public CardNumberNotValidException(String s){
        super(s);
    }
}

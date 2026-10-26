package com.joaopedro.gestaoVagas.exception;

public class UserFoundException extends RuntimeException {
    public UserFoundException() {
        super("O usuário já existe!");
    }
}

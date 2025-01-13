package com.biscoitosorte.biscoito_sorte.exception;

public abstract class DadosInvalidosException extends RuntimeException{
    public DadosInvalidosException(String atributo) {
        super("Os dados de " + atributo + "estão inválidos, ou não foram fornecidos.");
    }
}

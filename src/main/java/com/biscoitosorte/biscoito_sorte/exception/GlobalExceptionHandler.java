package com.biscoitosorte.biscoito_sorte.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(LuckMessageDadosInvalidosException.class)
    public ResponseEntity<Object> handleLuckMessageDadosInvalidosException(LuckMessageDadosInvalidosException ex, WebRequest request){
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", ex.getMessage());
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(UserDadosInvalidosException.class)
    public ResponseEntity<Object> handleUserDadosInvalidosException(UserDadosInvalidosException ex, WebRequest request){
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", ex.getMessage());
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }

    // Tratamento para Produto não encontrado (404)
    @ExceptionHandler(MessageNotFoundException.class)
    public ResponseEntity<Object> handleProdutoNotFoundException(MessageNotFoundException ex, WebRequest request) {
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", ex.getMessage());
        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);  // 404 Not Found
    }

    // Tratamento para outros erros genéricos do servidor (500)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGenericException(Exception ex, WebRequest request) {
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Ocorreu um erro interno no servidor");
        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);  // 500 Internal Server Error
    }
}

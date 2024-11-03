package com.example.strangerThingsAPI.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice // Indica que esta clase maneja
public class ControladorDeExcepciones {

    // Maneja excepciones de tipo RecursoNoEncontradoException
    @ExceptionHandler(RecursoInexistenteExcepcion.class)
    public ResponseEntity<String> manejarRecursoNoEncontrado(RecursoInexistenteExcepcion ex) {
        // Retorna un mensaje de error
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}

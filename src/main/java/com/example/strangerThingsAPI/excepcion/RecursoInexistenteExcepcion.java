package com.example.strangerThingsAPI.excepcion;

public class RecursoInexistenteExcepcion extends RuntimeException {

    // Constructor que recibe un mensaje de error
    public RecursoInexistenteExcepcion(String message) {
        // Llama al constructor de la clase base (RuntimeException) con el mensaje
        super(message);
    }
}

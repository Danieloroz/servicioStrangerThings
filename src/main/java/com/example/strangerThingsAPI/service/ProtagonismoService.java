package com.example.strangerThingsAPI.service;

import com.example.strangerThingsAPI.model.Protagonismo;
import com.example.strangerThingsAPI.repository.ProtagonismoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que esta clase es un servicio
public class ProtagonismoService {
    private final ProtagonismoRepository protagonismoRepository;

    public ProtagonismoService(ProtagonismoRepository protagonismoRepository) { //Constructor
        this.protagonismoRepository = protagonismoRepository;
    }

    // Metodo para obtener todos los protagonistas
    public List<Protagonismo> obtenerTodosProtagonistas() {
        return protagonismoRepository.findAll();
    }
}

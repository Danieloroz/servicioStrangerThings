package com.example.strangerThingsAPI.service;

import com.example.strangerThingsAPI.model.Personaje;
import com.example.strangerThingsAPI.repository.PersonajeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que esta clase es un servicio
public class PersonajeService {
    private final PersonajeRepository personajeRepository;

    public PersonajeService(PersonajeRepository personajeRepository) {
        this.personajeRepository = personajeRepository;
    }

    // Metodo para obtener todos los personajes
    public List<Personaje> obtenerTodosPersonajes(){
        return personajeRepository.findAll();
    }
}

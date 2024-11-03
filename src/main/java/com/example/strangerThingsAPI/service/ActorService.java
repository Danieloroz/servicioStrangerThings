package com.example.strangerThingsAPI.service;

import com.example.strangerThingsAPI.model.Actor;
import com.example.strangerThingsAPI.repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que esta clase es un servicio
public class ActorService {
    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) { //Constructor
        this.actorRepository = actorRepository;
    }

    // Metodo para obtener todos los actores
    public List<Actor> obtenerTodosActores(){
        return actorRepository.findAll();
    }
}

package com.example.strangerThingsAPI.service;

import com.example.strangerThingsAPI.model.Episodio;
import com.example.strangerThingsAPI.repository.EpisodioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Indica que esta clase es un servicio
public class EpisodioService {
    private final EpisodioRepository episodioRepository;

    public EpisodioService(EpisodioRepository episodioRepository) { //Constructor
        this.episodioRepository = episodioRepository;
    }

    // Metodo para obtener todos los episodios
    public List<Episodio> obtenerTodosEpisodios(){
        return episodioRepository.findAll();
    }

    // Metodo para obtener un episodio por su ID
    public Optional<Episodio> obtenerEpisodioPorId(Long id) {
        return episodioRepository.findById(id);
    }

    // Metodo para guardar un episodio
    public void guardar(Episodio episodio) {
        episodioRepository.save(episodio);
    }
}


package com.example.strangerThingsAPI.service;

import com.example.strangerThingsAPI.model.Temporada;
import com.example.strangerThingsAPI.repository.TemporadaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que esta clase es un servicio
public class TemporadaService {
    private final TemporadaRepository temporadaRepository;

    public TemporadaService(TemporadaRepository temporadaRepository) {
        this.temporadaRepository = temporadaRepository;
    }

    // Metodo para obtener todas las temporadas
    public List<Temporada> obtenerTodasTemporadas(){
        return temporadaRepository.findAll();
    }

    // Metodo para guardar una temporada
    public void guardar(Temporada temporada) {
        temporadaRepository.save(temporada);
    }
}
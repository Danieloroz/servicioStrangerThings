package com.example.strangerThingsAPI.service;

import com.example.strangerThingsAPI.model.Detalles;
import com.example.strangerThingsAPI.repository.DetallesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que esta clase es un servicio
public class DetallesService {

    private final DetallesRepository detallesRepository;

    public DetallesService(DetallesRepository detallesRepository) {
        this.detallesRepository = detallesRepository;
    }

    // Metodo para obtener toda la información sobre vikingos
    public List<Detalles> obtenerTodosDetalles(){
        return detallesRepository.findAll();
    }
}

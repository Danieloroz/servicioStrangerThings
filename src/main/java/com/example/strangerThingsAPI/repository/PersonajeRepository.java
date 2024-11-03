package com.example.strangerThingsAPI.repository;

import com.example.strangerThingsAPI.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
    // JpaRepository proporciona operaciones CRUD
}

package com.example.strangerThingsAPI.repository;

import com.example.strangerThingsAPI.model.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemporadaRepository extends JpaRepository<Temporada, Long> {
    // JpaRepository proporciona operaciones CRUD
}

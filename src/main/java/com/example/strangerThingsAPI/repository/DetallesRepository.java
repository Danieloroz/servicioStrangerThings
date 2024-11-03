package com.example.strangerThingsAPI.repository;

import com.example.strangerThingsAPI.model.Detalles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallesRepository extends JpaRepository<Detalles, Long> {
    // JpaRepository proporciona operaciones CRUD
}

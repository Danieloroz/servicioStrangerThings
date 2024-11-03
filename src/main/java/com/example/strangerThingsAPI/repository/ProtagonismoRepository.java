package com.example.strangerThingsAPI.repository;

import com.example.strangerThingsAPI.model.Protagonismo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProtagonismoRepository extends JpaRepository<Protagonismo, Long> {
    // JpaRepository proporciona operaciones CRUD
}

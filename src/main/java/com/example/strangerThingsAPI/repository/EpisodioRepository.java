package com.example.strangerThingsAPI.repository;

import com.example.strangerThingsAPI.model.Episodio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodioRepository extends JpaRepository<Episodio, Long> {
    // JpaRepository proporciona operaciones CRUD
}

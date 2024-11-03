package com.example.strangerThingsAPI.repository;

import com.example.strangerThingsAPI.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
    // JpaRepository proporciona operaciones CRUD
}

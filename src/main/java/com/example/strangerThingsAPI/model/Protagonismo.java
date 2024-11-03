package com.example.strangerThingsAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data // Genera los métodos getter, setter, toString, equals y hashCode
public class Protagonismo {

    @Id // Indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // Relación muchos a uno con la entidad Actor
    private Actor actor;

    @ManyToOne // Relación muchos a uno con la entidad Temporada
    private Temporada temporada;
}

package com.example.strangerThingsAPI.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data // Genera los métodos getter, setter, toString, equals y hashCode
public class Actor {

    @Id // Indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToOne // Relación uno a uno con la entidad Personaje
    private Personaje personaje;
}

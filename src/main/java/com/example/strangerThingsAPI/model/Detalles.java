package com.example.strangerThingsAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data // Genera los métodos getter, setter, toString, equals y hashCode
public class Detalles {

    @Id // Indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String poster;
    private String creador;
    private String clasificacion;
    private double calificacionPromedio;
    private String mejorEpisodio;
    private int temporadas;
    private int anioEmision;
}

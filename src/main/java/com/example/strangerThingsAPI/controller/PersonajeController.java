package com.example.strangerThingsAPI.controller;

import com.example.strangerThingsAPI.model.Personaje;
import com.example.strangerThingsAPI.service.PersonajeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/st/personajes") // Define la ruta para las solicitudes
public class PersonajeController {

    private final PersonajeService personajeService;
    public PersonajeController(PersonajeService personajeService) {
        this.personajeService = personajeService;
    }

    //Obtiene la lista de personajes y los muestra en HTML
    @GetMapping
    public String mostrarPersonajes(Model model) {
        List<Personaje> personajes = personajeService.obtenerTodosPersonajes();
        model.addAttribute("personajes", personajes);
        return "personajes";
    }
}

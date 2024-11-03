package com.example.strangerThingsAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.strangerThingsAPI.model.Actor;
import com.example.strangerThingsAPI.service.ActorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/st/actores") // Define la ruta para las solicitudes
public class ActorController {

    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    // Obtiene la lista de todos los actores y retorna HTML
    @GetMapping
    public String obtenerActores(Model model) {
        List<Actor> actores = actorService.obtenerTodosActores();
        model.addAttribute("actores", actores);
        return "actores";
    }
}

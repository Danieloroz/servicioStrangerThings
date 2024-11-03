package com.example.strangerThingsAPI.controller;

import com.example.strangerThingsAPI.service.ProtagonismoService;
import com.example.strangerThingsAPI.model.Protagonismo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/st/protagonismos") // Define la ruta para las solicitudes
public class ProtagonismoController {

    private final ProtagonismoService protagonismoService;

    public ProtagonismoController(ProtagonismoService protagonismoService) {
        this.protagonismoService = protagonismoService;
    }

    //Obtiene la lista de Protagonistas y retorna un HTML
    @GetMapping
    public String mostrarProtagonistas(Model model) {
        List<Protagonismo> protagonistas = protagonismoService.obtenerTodosProtagonistas();
        model.addAttribute("protagonistas", protagonistas);
        return "protagonistas";
    }

}


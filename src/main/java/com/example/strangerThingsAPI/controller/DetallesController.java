package com.example.strangerThingsAPI.controller;

import com.example.strangerThingsAPI.model.Detalles;
import com.example.strangerThingsAPI.service.DetallesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/st/detalles") // Define la ruta para las solicitudes
public class DetallesController {

    private final DetallesService detallesService;

    public DetallesController(DetallesService detallesService) {
        this.detallesService = detallesService;
    }

    // Obtiene la lista de todos los detalles y retorna HTML
    @GetMapping
    public String mostrarDetalles(Model model) {
        List<Detalles> detalles = detallesService.obtenerTodosDetalles();
        model.addAttribute("detalles", detalles);
        return "detalles";
    }

}


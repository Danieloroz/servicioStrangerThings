package com.example.strangerThingsAPI.controller;

import com.example.strangerThingsAPI.model.Detalles;
import com.example.strangerThingsAPI.service.DetallesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class MenuController {

    private final DetallesService detallesService;

    public MenuController(DetallesService detallesService) {
        this.detallesService = detallesService;
    }

    @GetMapping("/") // Define la ruta para el menú
    public String mostrarMenu(Model model) {
        List<Detalles> detallesList = detallesService.obtenerTodosDetalles();
        model.addAttribute("detallesList", detallesList);
        return "menu";
    }
}

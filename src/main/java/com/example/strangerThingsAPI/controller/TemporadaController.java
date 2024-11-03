package com.example.strangerThingsAPI.controller;

import com.example.strangerThingsAPI.model.Temporada;
import com.example.strangerThingsAPI.service.TemporadaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/st/temporadas") // Define la ruta para las solicitudes
public class TemporadaController {

    private final TemporadaService temporadaService;

    public TemporadaController(TemporadaService temporadaService) {
        this.temporadaService = temporadaService;
    }

    //Obtiene la lista de temporadas y retorna un HTML
    @GetMapping
    public String mostrarTemporadas(Model model) {
        List<Temporada> temporadas = temporadaService.obtenerTodasTemporadas();
        model.addAttribute("temporadas", temporadas);
        return "temporadas";
    }

    // Muestra el formulario para agregar una temporada
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaTemporada(Model model) {
        model.addAttribute("temporada", new Temporada());
        return "formularioTemporada";
    }

    // Procesa el formulario para agregar una temporada
    @PostMapping("/guardar")
    public String guardarTemporada(@ModelAttribute Temporada temporada) {
        temporadaService.guardar(temporada);
        return "redirect:/st/temporadas";
    }
}
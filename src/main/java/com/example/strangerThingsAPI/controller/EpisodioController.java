package com.example.strangerThingsAPI.controller;

import com.example.strangerThingsAPI.excepcion.RecursoInexistenteExcepcion;
import com.example.strangerThingsAPI.model.Episodio;
import com.example.strangerThingsAPI.service.EpisodioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/st/episodios") // Define la ruta para las solicitudes
public class EpisodioController {

    private final EpisodioService episodioService;

    public EpisodioController(EpisodioService episodioService) {
        this.episodioService = episodioService;
    }

    // Obtiene la lista de todos los episodios y retorna HTML
    @GetMapping
    public String mostrarEpisodios(Model model) {
        List<Episodio> episodios = episodioService.obtenerTodosEpisodios();
        model.addAttribute("episodios", episodios);
        return "episodiosTodos";
    }

    // Obtiene un episodio y retorna su HTML
    @GetMapping("/{id}")
    public String mostrarEpisodioPorId(@PathVariable Long id, Model model) {
        Episodio episodio = episodioService.obtenerEpisodioPorId(id)
                .orElseThrow(() -> new RecursoInexistenteExcepcion("Este episodio no existe"));
        model.addAttribute("episodio", episodio);
        return "episodio";
    }

    // Muestra el formulario para agregar un episodio
    @GetMapping("/crear")
    public String mostrarFormularioNuevoEpisodio(Model model) {
        model.addAttribute("episodio", new Episodio());
        return "formularioEpisodio";
    }

    // Procesa el formulario para agregar un episodio
    @PostMapping("/guardar")
    public String guardarEpisodio(@ModelAttribute Episodio episodio) {
        episodioService.guardar(episodio);
        return "redirect:/st/episodios";
    }
}


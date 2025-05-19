package com.bootcamp.retoTecnico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.bootcamp.retoTecnico.model.Persona;
import com.bootcamp.retoTecnico.service.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/view")
public class PersonaViewController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/personas")
    public String mostrarPersonas(Model model) {
        List<Persona> personas = personaService.generatePersonas();
        model.addAttribute("personas", personas);
        return "tablaPersonas";
    }
}
package com.bootcamp.retoTecnico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.retoTecnico.model.Persona;
import com.bootcamp.retoTecnico.service.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController()
@RequestMapping("/persona")
public class PersonaController {
    
    @Autowired
    private final PersonaService personaService; 
    
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }
    /**
     * Endpoint para obtener una lista de personas generadas con datos ficticios.
     * @return ResponseEntity<List<Persona>> - Lista de objetos Persona con datos ficticios.
     */
    @GetMapping
    public ResponseEntity<List<Persona>> getPersonas() {
        List<Persona> personas = personaService.generatePersonas();
        return ResponseEntity.ok(personas);
    }
    
}

package com.bootcamp.retoTecnico.service;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcamp.retoTecnico.model.Persona;
@Service
public class PersonaService {
    
    public PersonaService() {

    }
    /**
     * Método para generar una lista de personas con datos ficticios.
     * @return List<Persona> - Lista de objetos Persona con datos ficticios.
     */
    public List<Persona> generatePersonas() {
        List<Persona> personas = List.of(
    new Persona.Builder()
        .nombre("Cristian Campos")
        .genero("male")
        .ubicacion("Calle de Toledo, 8471")
        .fechaNacimiento(Date.from(Instant.parse("1987-07-15T10:28:26.518Z")))
        .correo("cristian.campos@example.com")
        .urlFoto("https://randomuser.me/api/portraits/med/men/18.jpg")
        .build(),

    new Persona.Builder()
        .nombre("Gabrielle Robinson")
        .genero("female")
        .ubicacion("3552 Grove Road")
        .fechaNacimiento(Date.from(Instant.parse("1975-10-08T11:43:25.663Z")))
        .correo("gabrielle.robinson@example.com")
        .urlFoto("https://randomuser.me/api/portraits/med/women/40.jpg")
        .build(),

    new Persona.Builder()
        .nombre("Maik Rupp")
        .genero("male")
        .ubicacion("Beethovenstraße 4")
        .fechaNacimiento(Date.from(Instant.parse("1981-07-08T04:28:17.313Z")))
        .correo("maik.rupp@example.com")
        .urlFoto("https://randomuser.me/api/portraits/med/men/39.jpg")
        .build(),

    new Persona.Builder()
        .nombre("Leticia Teixeira")
        .genero("female")
        .ubicacion("Rua São José, 548")
        .fechaNacimiento(Date.from(Instant.parse("1957-03-16T23:37:33.931Z")))
        .correo("leticia.teixeira@example.com")
        .urlFoto("https://randomuser.me/api/portraits/med/women/57.jpg")
        .build(),

    new Persona.Builder()
        .nombre("Anni Valkeeniemi")
        .genero("female")
        .ubicacion("Rauhankatu 18")
        .fechaNacimiento(Date.from(Instant.parse("1950-01-11T07:31:47.077Z")))
        .correo("anni.valkeeniemi@example.com")
        .urlFoto("https://randomuser.me/api/portraits/med/women/19.jpg")
        .build(),

    new Persona.Builder()
        .nombre("Jonas Schrøder")
        .genero("male")
        .ubicacion("Duevej 76")
        .fechaNacimiento(Date.from(Instant.parse("1953-06-12T08:17:50.917Z")))
        .correo("jonas.schroder@example.com")
        .urlFoto("https://randomuser.me/api/portraits/med/men/95.jpg")
        .build(),

    new Persona.Builder()
        .nombre("Flavie Petit")
        .genero("female")
        .ubicacion("23 Rue Bossuet")
        .fechaNacimiento(Date.from(Instant.parse("1987-01-14T06:50:06.339Z")))
        .correo("flavie.petit@example.com")
        .urlFoto("https://randomuser.me/api/portraits/med/women/34.jpg")
        .build(),

    new Persona.Builder()
        .nombre("Tomáš Procházka")
        .genero("male")
        .ubicacion("Dlouhá 731")
        .fechaNacimiento(Date.from(Instant.parse("1950-03-20T12:30:13.580Z")))
        .correo("tomas.prochazka@example.com")
        .urlFoto("https://randomuser.me/api/portraits/med/men/72.jpg")
        .build(),

    new Persona.Builder()
        .nombre("Gabriel Christensen")
        .genero("male")
        .ubicacion("Karlslunde Parkvej 3")
        .fechaNacimiento(Date.from(Instant.parse("1971-06-20T03:47:58.803Z")))
        .correo("gabriel.christensen@example.com")
        .urlFoto("https://randomuser.me/api/portraits/med/men/2.jpg")
        .build(),

    new Persona.Builder()
        .nombre("Sophie Martin")
        .genero("female")
        .ubicacion("9440 Rue de L'Abbé-Groult")
        .fechaNacimiento(Date.from(Instant.parse("1991-05-13T14:11:11.239Z")))
        .correo("sophie.martin@example.com")
        .urlFoto("https://randomuser.me/api/portraits/med/women/9.jpg")
        .build()
    );
        return personas;
    }
}

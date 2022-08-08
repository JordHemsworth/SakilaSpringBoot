package com.tsi.hemsworth.jordan.sakila.connect.filmActor;

import com.tsi.hemsworth.jordan.sakila.connect.actor.Actor;
import com.tsi.hemsworth.jordan.sakila.connect.actor.ActorRepository;
import com.tsi.hemsworth.jordan.sakila.connect.film.Film;
import com.tsi.hemsworth.jordan.sakila.connect.film.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmActors")
public class FilmActorController {


    @Autowired
    private final FilmRepository filmRepository;

    @Autowired
    private final ActorRepository actorRepository;

    @Autowired
    private final FilmActorRepository filmActorRepository;

    public FilmActorController(FilmRepository filmRepository, ActorRepository actorRepository,
                               FilmActorRepository filmActorRepository){
        this.filmRepository = filmRepository;
        this.actorRepository = actorRepository;
        this.filmActorRepository = filmActorRepository;
    }


    //Search actors details to return relevant films
    @GetMapping(params =  {"actorFirst", "actorLast"})
    public @ResponseBody
    List<Film> getFilmsByActor(@RequestParam(name = "actorFirst") String firstName,
                               @RequestParam(name = "actorLast") String lastName)
    {
        Actor actor = actorRepository.getActorByFirstNameAndLastName(firstName, lastName);
        return filmRepository.findByFilmsActorsActorId(actor.getId());
    }
}

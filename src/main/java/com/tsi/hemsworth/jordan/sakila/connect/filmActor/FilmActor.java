package com.tsi.hemsworth.jordan.sakila.connect.filmActor;


import com.tsi.hemsworth.jordan.sakila.connect.actor.Actor;
import com.tsi.hemsworth.jordan.sakila.connect.film.Film;

import javax.persistence.*;

@Entity
@Table(name="film_actor")
public class FilmActor {

    @EmbeddedId
    FilmActorKey id;

    @ManyToOne
    @MapsId("filmId")
    @JoinColumn(name = "film_id")
    Film film;

    @ManyToOne
    @MapsId("actorId")
    @JoinColumn(name = "actor_id")
    Actor actor;


    public FilmActor(Film film, Actor actor){
        this.film = film;
        this.actor = actor;
        id = new FilmActorKey( film.getFilm_id(), actor.getId());
    }

    public FilmActor(){

    }

    public FilmActorKey getId() {
        return id;
    }

    public void setId(FilmActorKey id) {
        this.id = id;
    }


}

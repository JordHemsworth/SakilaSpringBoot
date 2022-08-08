package com.tsi.hemsworth.jordan.sakila.connect.filmActor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FilmActorKey implements Serializable {

    @Column(name = "film_id")
    private int filmId;

    @Column(name = "actor_id")
    private int actorId;

    public FilmActorKey (int filmId, int actorId){
        this.filmId = filmId;
        this.actorId = actorId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }
}

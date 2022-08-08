package com.tsi.hemsworth.jordan.sakila.connect.film;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmRepository extends CrudRepository<Film,Integer>{

    List<Film> findByFilmsActorsActorId(int id);
}

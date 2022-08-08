package com.tsi.hemsworth.jordan.sakila.connect.actor;

import com.tsi.hemsworth.jordan.sakila.connect.actor.Actor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActorRepository extends CrudRepository<Actor,Integer> {

    List<Actor> getActorByFirstName(String first_name);

    Actor getActorByFirstNameAndLastName(String firstName, String lastName);
    Actor getActorById(int actorId);
}

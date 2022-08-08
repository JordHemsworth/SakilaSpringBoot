package com.tsi.hemsworth.jordan.sakila.connect.actor;


import com.tsi.hemsworth.jordan.sakila.connect.filmActor.FilmActor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="actor")
public class Actor {

    @Id
    @Column(name="actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Attributes
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;

    //FilmActor relationship
    @OneToMany(mappedBy = "actor")
    private Set<FilmActor> actorsFilms;

    public Actor(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName =lastName;
    }

    //Empty Constructor
    public Actor() {}

    //Getter and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

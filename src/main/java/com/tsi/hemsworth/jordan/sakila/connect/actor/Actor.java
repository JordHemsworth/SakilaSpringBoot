package com.tsi.hemsworth.jordan.sakila.connect.actor;


import javax.persistence.*;

@Entity
@Table(name="actor")
public class Actor {

    @Id
    @Column(name="actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actor_id;

    //Attributes
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;

    public Actor(String first_name, String last_name){
        this.firstName=first_name;
        this.lastName =last_name;
    }

    //Empty Constructor
    public Actor() {}

    //Getter and Setters

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirst_name() {
        return firstName;
    }

    public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

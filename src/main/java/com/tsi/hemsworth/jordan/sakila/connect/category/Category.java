package com.tsi.hemsworth.jordan.sakila.connect.category;

import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {

    @Id
    @Column(name="category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //Fails to create query for method public abstract if not called id

    //Attributes
    @Column(name="name")
    private String name;

    public Category(String name){
        this.name=name;
    }

    public Category(){}

    public int getCategoryId() {
        return id;
    }

    public void setCategoryId(int categoryId) {
        this.id = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

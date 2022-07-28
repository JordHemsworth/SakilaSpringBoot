package com.tsi.hemsworth.jordan.sakila.connect.category;

import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {

    @Id
    @Column(name="category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    //Attributes
    @Column(name="name")
    private String name;

    public Category(String name){
        this.name=name;
    }

    public Category(){}

    public int getCategory_id() {
        return categoryId;
    }

    public void setCategory_id(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

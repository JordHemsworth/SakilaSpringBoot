package com.tsi.hemsworth.jordan.sakila.connect.category;

import com.tsi.hemsworth.jordan.sakila.connect.actor.Actor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

    List<Category> getCatByName(String name);
    Category getCatById(int catId);

}

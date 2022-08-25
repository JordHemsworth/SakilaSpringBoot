
package com.tsi.hemsworth.jordan.sakila.connect;

import com.tsi.hemsworth.jordan.sakila.connect.actor.Actor;
import com.tsi.hemsworth.jordan.sakila.connect.category.Category;
import com.tsi.hemsworth.jordan.sakila.connect.film.Film;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    public void test_GetFirstName(){
        Actor testActor = new Actor();
        testActor.setFirstName("James");
        assertEquals("James", testActor.getFirstName(), "The name didn't match");
    }

    @Test
    public void test_GetLastName(){
        Actor testActor = new Actor();
        testActor.setLastName("Harden");
        assertEquals("Harden", testActor.getLastName(), "The name didn't match");
    }

    @Test
    public void test_GetCategoryName(){
        Category testCategory = new Category();
        testCategory.setName("Actionee");
        assertEquals("Actionee", testCategory.getName(), "The name didn't match");

    }

    @Test
    public void test_GetRating(){
        Film testRating = new Film();
        testRating.setRating("1");
        assertEquals("1", testRating.getRating());
    }


    @Test
    public void test_GetLength(){
        Film testLength = new Film();
        testLength.setLength(120);
        assertEquals(120, testLength.getLength());
    }
}

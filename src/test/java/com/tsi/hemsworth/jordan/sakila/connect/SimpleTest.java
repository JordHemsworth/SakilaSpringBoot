
package com.tsi.hemsworth.jordan.sakila.connect;

import com.tsi.hemsworth.jordan.sakila.connect.actor.Actor;
import com.tsi.hemsworth.jordan.sakila.connect.category.Category;
import com.tsi.hemsworth.jordan.sakila.connect.film.Film;
import com.tsi.hemsworth.jordan.sakila.connect.filmActor.FilmActorKey;
import com.tsi.hemsworth.jordan.sakila.connect.language.Language;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    //
    //Test Actor Setters
    //
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
    public void test_GetActorId(){
        Actor testActor = new Actor();
        testActor.setId(1);
        assertEquals(1, testActor.getId(), "The ID didn't match");
    }

    //
    //Test Category Setters
    //
    @Test
    public void test_GetCategoryName(){
        Category testCategory = new Category();
        testCategory.setName("Actionee");
        assertEquals("Actionee", testCategory.getName(), "The name didn't match");

    }

    @Test
    public void test_GetCategoryId(){
        Category testCategory = new Category();
        testCategory.setCategoryId(1);
        assertEquals(1, testCategory.getCategoryId(), "The name didn't match");
    }

    //
    //Test Film Setters
    //

    @Test
    public void test_GetFilmId(){
        Film testRating = new Film();
        testRating.setFilm_id(1);
        assertEquals(1, testRating.getFilm_id());
    }

    @Test
    public void test_GetFilmTitle(){
        Film testRating = new Film();
        testRating.setTitle("Harry P");
        assertEquals("Harry P", testRating.getTitle());
    }

    @Test
    public void test_GetFilmDesc(){
        Film testRating = new Film();
        testRating.setDescription("Harry P magic");
        assertEquals("Harry P magic", testRating.getDescription());
    }

    @Test
    public void test_GetFilmYear(){
        Film testRating = new Film();
        testRating.setRelease_year(2020);
        assertEquals(2020, testRating.getRelease_year());
    }

    @Test
    public void test_GetFilmLang(){
        Film testRating = new Film();
        testRating.setLanguage_id(1);
        assertEquals(1, testRating.getLanguage_id());
    }

    @Test
    public void test_GetFilmRentDur(){
        Film testRating = new Film();
        testRating.setRental_duration(20);
        assertEquals(20, testRating.getRental_duration());
    }

    @Test
    public void test_GetFilmRentRate(){
        Film testRating = new Film();
        testRating.setRental_rate(BigDecimal.valueOf(10.99));
        assertEquals(BigDecimal.valueOf(10.99), testRating.getRental_rate());
    }

    @Test
    public void test_GetLength(){
        Film testLength = new Film();
        testLength.setLength(120);
        assertEquals(120, testLength.getLength());
    }

    @Test
    public void test_GetFilmCost(){
        Film testLength = new Film();
        BigDecimal value = (BigDecimal.valueOf(10.99));
        testLength.setReplacement_cost(value);
        assertEquals(value, testLength.getReplacement_cost());
    }

    @Test
    public void test_GetRating(){
        Film testRating = new Film();
        testRating.setRating("1");
        assertEquals("1", testRating.getRating());
    }

    @Test
    public void test_GetSpecFeatures(){
        Film testRating = new Film();
        testRating.setSpecial_features("1");
        assertEquals("1", testRating.getSpecial_features());
    }


    //
    // Test Language Setters
    //

    @Test
    public void test_GetLangId(){
        Language testRating = new Language();
        testRating.setLanguageId(1);
        assertEquals(1, testRating.getLanguageId());
    }

    @Test
    public void test_GetLangName(){
        Language testRating = new Language();
        testRating.setName("English");
        assertEquals("English", testRating.getName());
    }

    @Test
    public void test_GetLangUpdate(){
        Language testRating = new Language();
        testRating.setLastUpdate("21/04/2020");
        assertEquals("21/04/2020", testRating.getLastUpdate());
    }



}

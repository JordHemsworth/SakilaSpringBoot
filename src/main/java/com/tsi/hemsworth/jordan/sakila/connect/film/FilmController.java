package com.tsi.hemsworth.jordan.sakila.connect.film;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController //Search for all packages below Spring Sakila, Looks for Rest Controllers
@RequestMapping("/Sakila")
public class FilmController {

    @Autowired  //Creates actor repository implementation
    private final FilmRepository filmRepository;

    public FilmController(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @GetMapping("/Get_Films")
    public @ResponseBody Iterable<Film> getFilms(){
        return filmRepository.findAll();
    }

    @PostMapping("/Add_New_Film")
    public @ResponseBody String addNewFilm(@RequestParam String title, @RequestParam String description, @RequestParam Integer release_year, @RequestParam Integer language_id,
                                           @RequestParam Integer rental_duration,
                                           @RequestParam BigDecimal rental_rate, @RequestParam Integer length, @RequestParam BigDecimal replacement_cost,
                                           @RequestParam String rating, @RequestParam String special_features){
        Film film = new Film(title, description, release_year, language_id, rental_duration, rental_rate, length, replacement_cost, rating, special_features);
        filmRepository.save(film);
        return "saved";
    }

    @DeleteMapping("/Delete_Film_By_Id")
    public @ResponseBody
    void deleteFilmById(@RequestParam int id){
        filmRepository.deleteById(id);
    }


}
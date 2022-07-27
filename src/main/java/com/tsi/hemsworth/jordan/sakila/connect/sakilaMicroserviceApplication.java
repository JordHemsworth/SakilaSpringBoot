package com.tsi.hemsworth.jordan.sakila.connect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@CrossOrigin("http://localhost:3306")
@SpringBootApplication
@RestController  //handles GET, POST, DELETE, PUT requests
@RequestMapping("/Sakila")
public class sakilaMicroserviceApplication{

	@Autowired
	private FilmRepository filmRepository;

	@Autowired
	private ActorRepository actorRepository;



	public static void main(String[] args) {
		SpringApplication.run(sakilaMicroserviceApplication.class, args);
	}

	public sakilaMicroserviceApplication(ActorRepository actorRepository, FilmRepository filmRepository){
		this.actorRepository = actorRepository;
		this.filmRepository = filmRepository;
	}


	//@ResponseBody
	@PostMapping("/Add_New_Actor")
	public @ResponseBody String addNewActor(@RequestParam String first_name, @RequestParam String last_name){
		Actor a = new Actor(first_name, last_name);
		System.out.println(first_name + " " + last_name);
		actorRepository.save(a);
		return "saved";
	}

	//Get request / read function
	@GetMapping("/All_Actors")
	public @ResponseBody
	Iterable<Actor>getAllActors(){
		return actorRepository.findAll();
	}

	@DeleteMapping("/Delete_Actor_By_Id")
	public @ResponseBody
	void deleteActorById(@RequestParam int id){
		actorRepository.deleteById(id);
	}

	@GetMapping("/All_Films")
	public @ResponseBody
	Iterable<Film>getAllFilms(){
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
	void deleteFilmById(@RequestParam Integer id){
		filmRepository.deleteById(id);
	}



}

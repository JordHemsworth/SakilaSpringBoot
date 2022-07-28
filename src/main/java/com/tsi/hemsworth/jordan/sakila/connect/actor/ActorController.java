package com.tsi.hemsworth.jordan.sakila.connect.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //Search for all packages below Spring Sakila, Looks for Rest Controllers
@RequestMapping("/Sakila")
public class ActorController {

    @Autowired  //Creates actor repository implementation
    private final ActorRepository actorRepository;

    public ActorController(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    //Get request / read function
    @GetMapping("/All_Actors")
    public @ResponseBody
    Iterable<Actor>getAllActors(){
        return actorRepository.findAll();
    }

    //@ResponseBody
    @PostMapping("/Add_New_Actor")
    public @ResponseBody String addNewActor(@RequestParam String first_name, @RequestParam String last_name){
        Actor actor = new Actor(first_name, last_name);
        System.out.println(first_name + " " + last_name);
        actorRepository.save(actor);
        return "saved";
    }

    @DeleteMapping("/Delete_Actor_By_Id")
    public @ResponseBody
    void deleteActorById(@RequestParam int id){
        actorRepository.deleteById(id);
    }

    @GetMapping("/Get_Actor_By_First_Name")
    public @ResponseBody
    Iterable<Actor>getActorByFirstName(@RequestParam String first_name) {
        return actorRepository.getActorByFirstName(first_name);
    }


}

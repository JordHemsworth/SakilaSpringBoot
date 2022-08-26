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
    public @ResponseBody String addNewActor(@RequestParam String firstName, @RequestParam String lastName){
        Actor actor = new Actor(firstName, lastName);
        actorRepository.save(actor);
        return "saved";
    }

    @GetMapping("/Get_Actor_By_First_Name")
    public @ResponseBody
    Iterable<Actor>getActorByFirstName(@RequestParam String firstName) {
        return actorRepository.getActorByFirstName(firstName);
    }
    @GetMapping("/Get_Actor_By_Id")
    public @ResponseBody
    Actor getActorById(@RequestParam int actorId) {
        return actorRepository.getActorById(actorId);
    }

    // Update/edit actor by id
    @PatchMapping("/Edit_Actor_By_Id")
    public @ResponseBody
    void editActorById(@RequestParam int actorId, @RequestBody ActorDTO data) {

            Actor existingActor = actorRepository.getActorById(actorId);

            existingActor.setFirstName(data.getFirstName());
            existingActor.setLastName(data.getLastName());

            actorRepository.save(existingActor);
    }

    @DeleteMapping("/Delete_Actor_By_Id")
    public @ResponseBody
    void deleteActorById(@RequestParam int actorId){
        actorRepository.deleteById(actorId);
    }


}

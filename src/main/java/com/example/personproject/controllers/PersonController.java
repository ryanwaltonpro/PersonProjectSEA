package com.example.personproject.controllers;

import com.example.personproject.entities.Person;
import com.example.personproject.services.PersonService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PersonController {

    PersonService service = new PersonService();
    @GetMapping(path="/", produces="application/json")
    public List<Person> getPeople(){
        return service.getAllPeople();
    }

    @PostMapping(path="/create", produces="application/json")
    public ResponseEntity<Person> createPerson(@RequestBody @Valid Person person){
        service.addPerson(person);
        return new ResponseEntity<Person>(person, HttpStatus.OK);

    }
    @DeleteMapping(path="/delete/")
    public ResponseEntity<?> deletePerson(@RequestParam @Valid int id){
        service.deletePerson(id);
        return ResponseEntity.ok().build();
    }
    @PatchMapping(path="/update")
    public ResponseEntity<?> updatePerson(@RequestBody Person person){
        service.updatePerson(person);
        return ResponseEntity.ok().build();
    }


}

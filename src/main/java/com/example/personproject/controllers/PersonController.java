package com.example.personproject.controllers;

import com.example.personproject.DTO.PersonDTO;
import com.example.personproject.entities.Person;
import com.example.personproject.services.PersonService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService service;

    @GetMapping(path="/", produces="application/json")
    public List<Person> getPeople(){
        return service.getAllPeople();
    }

    @PostMapping(path="/create", produces="application/json")
    public ResponseEntity<PersonDTO> createPerson(@RequestBody @Valid Person person){
        service.addPerson(person);
        return new ResponseEntity<PersonDTO>(new PersonDTO(person), HttpStatus.OK);

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

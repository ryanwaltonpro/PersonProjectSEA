package com.example.personproject.controllers;

import com.example.personproject.entities.Person;
import com.example.personproject.repositories.PersonService;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    PersonService service = new PersonService();
    @GetMapping(path="/", produces="application/json")
    public List<Person> getPeople(){
        return service.getAllPeople();
    }

    @PostMapping(path="/create", produces="application/json")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        try{
            service.addPerson(person);
            return new ResponseEntity<Person>(person, HttpStatus.OK);
        } catch(Exception e){
            return new ResponseEntity<Person>(person, HttpStatus.BAD_REQUEST);
        }
    }




}

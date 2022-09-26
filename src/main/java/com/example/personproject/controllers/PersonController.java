package com.example.personproject.controllers;

import com.example.personproject.entities.Person;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    private List<Person> people;

    private PersonController(){
        people = new ArrayList<>();
    }

    @GetMapping(path="/", produces="application/json")
    public List<Person> getPeople(){
        return getAllPeople();
    }

    @PostMapping(path="/create", produces="application/json")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        people.add(person);
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }

    private List<Person> getAllPeople(){
        return people;
    }



}

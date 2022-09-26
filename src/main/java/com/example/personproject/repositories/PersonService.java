package com.example.personproject.repositories;

import com.example.personproject.entities.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    private List<Person> people;
    public PersonService(){
        people = new ArrayList<>();
    }
    public List<Person> getAllPeople(){
        return people;
    }

    public void addPerson(Person p){
        people.add(p);
    }
}

package com.example.personproject.DTO;

import com.example.personproject.entities.Person;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonDTO {
    private String firstname;
    private String lastname;

    public PersonDTO(Person person){
        this.firstname = person.getFirstname();
        this.lastname = person.getLastname();
    }
}

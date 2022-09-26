package com.example.personproject.repositories;

import com.example.personproject.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
    List<Person> fundPersonByName(String name);
}

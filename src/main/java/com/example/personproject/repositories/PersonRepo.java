package com.example.personproject.repositories;

import com.example.personproject.entities.Person;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.function.Function;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
    List<Person> findAllByAge(int age);
    @Query("SELECT p from Person p")
    List<Person> findAll();
}

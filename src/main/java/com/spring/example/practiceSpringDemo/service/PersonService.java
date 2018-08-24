package com.spring.example.practiceSpringDemo.service;

import com.spring.example.practiceSpringDemo.model.Person;

import java.util.List;

/**
 * Created by ganesan76 on 7/8/18.
 */
public interface PersonService {

    //Person findByName(String name);
   // Person findById(int id);

    List<Person> findAllPerson();

    Person findAllByLocations(int location);

    List<Person> addNewPerson(Person person);

}

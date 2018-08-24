package com.spring.example.practiceSpringDemo.controller;

import com.spring.example.practiceSpringDemo.model.Person;
import com.spring.example.practiceSpringDemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ganesan76 on 7/7/18.
 */

@RestController
@RequestMapping("/api")
public class demoController {

    @Value("${welcome.message}")
    private String welcomeMessage;

    @Autowired
    private PersonService personService;

    @RequestMapping("/firstEndPoint")
    public String getDemoString() {
        return welcomeMessage;
    }

    @RequestMapping("/personList")
    public List<Person> getAllPerson() {

        return personService.findAllPerson();
    }

    @RequestMapping(value = "/addPerson", method = RequestMethod.POST)
    public List<Person> addPersonToList(@RequestBody Person person) {

        return personService.addNewPerson(person);
    }

    @RequestMapping(value = "/personList/{location}", method = RequestMethod.GET)
    public Person getPersonByLocation(@PathVariable("location") int location) {

        return personService.findAllByLocations(location);
    }


}

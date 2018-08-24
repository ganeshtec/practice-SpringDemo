package com.spring.example.practiceSpringDemo.service;

import com.spring.example.practiceSpringDemo.model.Person;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by ganesan76 on 7/8/18.
 */

@Service("personService")
public class PersonServiceImpl implements PersonService{

    private static  Map<Integer, Person> personMap = new HashMap<Integer, Person>();

    static {
        initPersons();
    }

    public List<Person> findAllPerson() {

        Collection<Person> collectionPer = personMap.values();

        List<Person> personList1 = new ArrayList<Person>();

        personList1.addAll(collectionPer);



        return personList1;


    }

    public  Person findAllByLocations(int location) {
        System.out.println("Input loction: "+location);
        return personMap.get(location);
    }

    public List<Person> addNewPerson(Person person) {

        personMap.put(person.getId(), person);

        return findAllPerson();
    }


    public static void initPersons(){

        Person person1 = new Person(1, 29, "Virat Kohli","Delhi");
        Person person2 = new Person(2, 37, "Dhoni","Ranchi");
        Person person3 = new Person(3, 31, "Dinesh Karthik","Chennai");

        personMap.put(person1.getId(), person1);
        personMap.put(person2.getId(), person2);
        personMap.put(person3.getId(), person3);

    }


}

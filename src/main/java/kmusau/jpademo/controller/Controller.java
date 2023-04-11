package kmusau.jpademo.controller;

import kmusau.jpademo.model.Person;
import kmusau.jpademo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    PersonService personService;

    @GetMapping("/hello")
    public String hello() {
        return "Welcome message";
    }

    @GetMapping("/persons")
    public List<Person> fetchAllPersons() {
        return personService.getAllPersons();
    }

    @PostMapping("add/person")
    public Person addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }
}

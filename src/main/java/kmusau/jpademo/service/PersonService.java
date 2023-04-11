package kmusau.jpademo.service;

import kmusau.jpademo.model.Address;
import kmusau.jpademo.model.Person;
import kmusau.jpademo.repository.AddressRepository;
import kmusau.jpademo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepo;

    @Autowired
    AddressRepository addressRepo;

    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }

    public Person addPerson(Person person) {
//        Address address = addressRepo.save(person.getAddress());
//        address.getId();
        return personRepo.save(person);
    }
}

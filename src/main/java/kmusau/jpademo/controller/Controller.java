package kmusau.jpademo.controller;

import kmusau.jpademo.model.*;
import kmusau.jpademo.repository.AddressRepository;
import kmusau.jpademo.service.*;
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

    @Autowired
    StudentsService studentsService;

    @Autowired
    CourseService courseService;

    @Autowired
    UserService userService;

    @Autowired
    MusicService musicService;

    @Autowired
    AddressRepository addressRepo;

    @GetMapping("/hello")
    public String hello() {
        return "Welcome message";
    }

    @GetMapping("/persons")
    public List<Person> fetchAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/address")
    public List<Address> getAddresses(){
        return addressRepo.findAll();
    }

    @PostMapping("add/person")
    public Person addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @GetMapping("/students")
    public List<Students> getAllStudents() {
        return studentsService.getAllStudents();
    }

    @PostMapping("/add/student")
    public Students addStudent(@RequestBody Students student) {
        return studentsService.addStudent(student);
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getCourses();
    }

    @PostMapping("/add/course")
    public Course createACourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @GetMapping("/users")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/add/user")
    public Users addUser(@RequestBody Users user) {
        return userService.addUser(user);
    }

    @GetMapping("/songs")
    public List<Music> getAllSongs() {
        return musicService.getAllSongs();
    }

    @PostMapping("/add/song")
    public Music addSong(@RequestBody Music music) {
        return musicService.addSong(music);
    }
}

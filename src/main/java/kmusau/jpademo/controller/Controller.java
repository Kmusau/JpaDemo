package kmusau.jpademo.controller;

import kmusau.jpademo.model.Course;
import kmusau.jpademo.model.Person;
import kmusau.jpademo.model.Students;
import kmusau.jpademo.service.CourseService;
import kmusau.jpademo.service.PersonService;
import kmusau.jpademo.service.StudentsService;
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
}

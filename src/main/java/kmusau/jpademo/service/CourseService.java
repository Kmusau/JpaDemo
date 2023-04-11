package kmusau.jpademo.service;

import kmusau.jpademo.model.Course;
import kmusau.jpademo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepo;

    public List<Course> getCourses() {
        return courseRepo.findAll();
    }

    public Course createCourse(Course course) {
        return courseRepo.save(course);
    }
}

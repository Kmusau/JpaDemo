package kmusau.jpademo.service;

import kmusau.jpademo.model.Students;
import kmusau.jpademo.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    @Autowired
    StudentsRepository studentsRepo;

    public List<Students> getAllStudents() {
        return studentsRepo.findAll();
    }

    public Students addStudent(Students student) {
        return studentsRepo.save(student);
    }
}

package kmusau.jpademo.service;

import kmusau.jpademo.model.Users;
import kmusau.jpademo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }

    public Users addUser(Users user) {
        return userRepo.save(user);
    }
}

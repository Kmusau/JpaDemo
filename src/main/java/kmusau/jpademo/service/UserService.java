package kmusau.jpademo.service;

import kmusau.jpademo.model.Music;
import kmusau.jpademo.model.Users;
import kmusau.jpademo.repository.MusicRepository;
import kmusau.jpademo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

    @Autowired
    MusicRepository musicRepo;

    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }

    public Users addUser(Users user) {
        return userRepo.save(user);
    }

    public Users addfavouriteMusic(Users user, int musicId) {
        var musicOpt = musicRepo.findById(musicId);
        var music = musicOpt.get();
        List<Music> musicList = new ArrayList<>();
        musicList.add(music);
        user.setMusic(musicList);
        return userRepo.save(user);
    }
}

package kmusau.jpademo.service;

import kmusau.jpademo.model.Music;
import kmusau.jpademo.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {
    @Autowired
    MusicRepository musicRepo;

    public List<Music> getAllSongs() {
        return musicRepo.findAll();
    }

    public Music addSong(Music music) {
        return musicRepo.save(music);
    }
}

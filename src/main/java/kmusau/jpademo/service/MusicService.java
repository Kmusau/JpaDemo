package kmusau.jpademo.service;

import kmusau.jpademo.model.Music;
import kmusau.jpademo.repository.MusicRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
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

    public Music updateName(Music musicObj, int musicId) {
        log.info("MusicObj :: {}", musicObj);
        var musicOpt = musicRepo.findById(musicId);
        var music = musicOpt.get();
        music.setSongTitle(musicObj.getSongTitle());
        return musicRepo.save(music);
    }
}

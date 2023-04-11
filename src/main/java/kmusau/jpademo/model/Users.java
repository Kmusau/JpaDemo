package kmusau.jpademo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;

    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name = "wishlist", joinColumns = @JoinColumn(name = "userid"), inverseJoinColumns = @JoinColumn(name = "musicid"))
    private List<Music> music;
}

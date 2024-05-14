package com.example.siteDiscoBackend.Band;

import com.example.siteDiscoBackend.Genre.Genre;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Table(name="bands")
@Entity(name="bands")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")


public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "band_genre",
            joinColumns = @JoinColumn(name="band_id"),
            inverseJoinColumns = @JoinColumn(name="genre_id")
    )
    private Set<Genre> genres = new HashSet<>();

    public Band(BandRequestDTO data){
        this.name = data.name();

    }
}

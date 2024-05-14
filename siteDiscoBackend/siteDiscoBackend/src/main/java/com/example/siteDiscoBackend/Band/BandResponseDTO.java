package com.example.siteDiscoBackend.Band;

import com.example.siteDiscoBackend.Genre.Genre;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public record BandResponseDTO(UUID id, String name, List<UUID> genres){
    public BandResponseDTO(Band band){
        this(band.getId(), band.getName(),
                band.getGenres().stream().map(Genre::getId).collect(Collectors.toList()));
    }
}

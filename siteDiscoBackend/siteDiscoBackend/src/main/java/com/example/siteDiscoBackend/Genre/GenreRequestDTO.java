package com.example.siteDiscoBackend.Genre;

import java.util.List;
import java.util.UUID;

public record GenreRequestDTO(String name, List<UUID> bands) {
}

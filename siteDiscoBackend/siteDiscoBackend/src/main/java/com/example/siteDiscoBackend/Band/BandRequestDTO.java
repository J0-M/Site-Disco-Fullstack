package com.example.siteDiscoBackend.Band;

import java.util.List;
import java.util.UUID;

public record BandRequestDTO(String name, List<UUID> genres) {
}

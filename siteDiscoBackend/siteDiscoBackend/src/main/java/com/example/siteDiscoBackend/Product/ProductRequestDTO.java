package com.example.siteDiscoBackend.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record ProductRequestDTO(@NotBlank @Size(min=2) String name, String image, String description, float price) {
}

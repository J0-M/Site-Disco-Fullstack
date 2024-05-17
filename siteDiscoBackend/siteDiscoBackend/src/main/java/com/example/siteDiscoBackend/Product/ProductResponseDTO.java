package com.example.siteDiscoBackend.Product;

import java.util.UUID;

public record ProductResponseDTO(UUID id, String name, String image, String description, float price) {
    public ProductResponseDTO(Product product){
        this(product.getId(), product.getName(), product.getImage(), product.getDescription(), product.getPrice());//acessa para checar se há ids de banda relacionado ao produto
    }
}

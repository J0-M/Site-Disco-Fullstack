package com.example.siteDiscoBackend.Product;

import com.example.siteDiscoBackend.Band.Band;
import com.example.siteDiscoBackend.Category.Category;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name="products")
@Entity(name="products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String image;
    private String description;
    private float price;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "band_id")
    private Band band;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;*/

    public Product(ProductRequestDTO data){
        this.name = data.name();
        this.image = data.image();
        this.description = data.description();
        this.price = data.price();
    }

}

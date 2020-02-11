package com.example.smartDelivery.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Product> products;
    private String name;

    public Restaurant(String name) {
        this.name=name;
        products= new ArrayList<>();
    }

    public Restaurant() {
    }
}

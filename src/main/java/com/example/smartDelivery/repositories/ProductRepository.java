package com.example.smartDelivery.repositories;

import com.example.smartDelivery.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}

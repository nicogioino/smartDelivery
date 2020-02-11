package com.example.smartDelivery.repositories;

import com.example.smartDelivery.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
}

package com.example.smartDelivery.repositories;

import com.example.smartDelivery.models.AppOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<AppOrder,Long> {
}

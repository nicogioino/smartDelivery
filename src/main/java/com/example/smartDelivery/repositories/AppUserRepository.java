package com.example.smartDelivery.repositories;

import com.example.smartDelivery.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {

    AppUser findByUsername(String name);


}

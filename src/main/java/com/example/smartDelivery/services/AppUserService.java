package com.example.smartDelivery.services;

import com.example.smartDelivery.models.AppUser;
import com.example.smartDelivery.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {

    @Autowired
    AppUserRepository appUserRepository;


    public AppUser addUser(AppUser appUser) {
       return appUserRepository.save(appUser);
    }
}

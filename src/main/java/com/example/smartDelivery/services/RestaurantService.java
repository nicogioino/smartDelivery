package com.example.smartDelivery.services;

import com.example.smartDelivery.models.Product;
import com.example.smartDelivery.models.Restaurant;
import com.example.smartDelivery.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    public Restaurant createNewRestaurant(String restaurant){
       return restaurantRepository.save(new Restaurant(restaurant));
    }

   public Restaurant updateRestaurantMenu(Product product, Long restaurantId){
        Restaurant restaurant= restaurantRepository.findById(restaurantId).get();
        restaurant.getProducts().add(product);
        return restaurantRepository.save(restaurant);
    }

    public List<Restaurant> getAll(){
        System.out.println("llega al service");
        return restaurantRepository.findAll();
    }


}

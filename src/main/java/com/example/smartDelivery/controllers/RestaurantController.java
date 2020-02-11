package com.example.smartDelivery.controllers;

import com.example.smartDelivery.models.Product;
import com.example.smartDelivery.models.Restaurant;
import com.example.smartDelivery.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("restaurant")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Restaurant> getAllRestaurants(){
        System.out.println("LLega al controller");
        return restaurantService.getAll();
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addRestaurant(@RequestBody String restaurant){
        restaurantService.createNewRestaurant(restaurant);
    }

    @RequestMapping(value = "/updateMenu/{id}",method = RequestMethod.POST)
    public void updateRestairant(@RequestBody Product product, @PathVariable("id") Long id){
        restaurantService.updateRestaurantMenu(product,id);
    }



}

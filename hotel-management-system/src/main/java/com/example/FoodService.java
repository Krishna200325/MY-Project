package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
@Data
public class FoodService {
        
        @Value ("${foodService}")
        private String foodService;

        public void displayfoodService(){
                System.out.println("Food Service: " +foodService);
        }

}

package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
@Data
public class Hotel {
        
        @Autowired 
        private  FoodService service;
  

        @Autowired 
        private Guest guest;

      @Autowired   
      private  Room room;


      public void displayAllDetails(){

        service.displayfoodService();
        guest.guestNamee();
        room.displayRoomInfo();

        System.out.println("Hotel services initialized successfully!");


      }








}

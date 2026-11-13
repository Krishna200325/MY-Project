package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component ("foodOrder")
@Data 
public class FoodOrder {
      
        @Autowired 
        private  DeliveryPartner deliveryPartner;
        
        @Autowired 
        private Menu menu;
        
        @Autowired 
        private Restaurant restaurant;


        public void AllDetails(){
                
               deliveryPartner.displayname();
               menu.displayMenu();
               restaurant.ditails();

              System.out.println(" Your food order is successfully placed!");
                
        }

        

}

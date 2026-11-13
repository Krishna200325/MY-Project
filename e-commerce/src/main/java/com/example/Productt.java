package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
@Data 
public class Productt {
      

        @Value("${productID}")
        private  int productID;

          @Value("${productName}")
        private String productName;

          @Value("${productCategory}")
        private String productCategory;
        
          @Value("${productbrand}")
        private String productbrand;

          @Value("${price}")
        private  int price;

          @Value("${productAvailability}")
        private String productAvailability;


        public  void displayAllDetails(){

                System.out.println("=============Product Details================");
                System.out.println("Product Id: " +productID);
                System.out.println("Product Catergory: " +productCategory);
                System.out.println("Product Brand: " +productbrand);
                System.out.println("Price: " +price);
                System.out.println("Product Availaibility: " +productAvailability);
        }

}

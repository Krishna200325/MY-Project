package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
@Data 
public class ProductService {
        

        @Autowired 
        private Productt product;

        public  void displayAllDetails(){
        product.displayAllDetails();
        
        }
}

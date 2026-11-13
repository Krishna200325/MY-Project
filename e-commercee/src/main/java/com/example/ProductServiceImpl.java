package com.example;

import org.springframework.stereotype.Component;

@Component 
public class ProductServiceImpl implements ProductService {

        @Override
        public void viewProduct(int productId){
                System.out.println("Product view successfully :" +productId);
        }

        @Override
        public void viewProductDetails(int productId) {
          
                System.out.println("Product details");
                System.out.println("Product Id:" +productId);
                System.out.println("Product name: Wheey Protein");
                System.out.println("Product Price: 3200");
        }

        @Override
        public void purchaseProduct(int productId) {
           System.out.println("Purchased Product By Id"+productId);
        System.out.println("Product purchase succesfuly");

        }
        
}

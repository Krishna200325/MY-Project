package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class ProductServiceProxy implements  ProductService {


        @Autowired 
        private ProductService service;

        private boolean authentication = true;
        private boolean hasPermission = true;

        @Override
        public void viewProduct(int productId) {
                // TODO Auto-generated method stub
                
                if(authentication){
                        if(hasPermission){

                                System.out.println("Viewing the product Authenticate succesfull");
                                service.viewProduct(productId);
                        }
                        else{
                                System.out.println("Access Denied");
                        }
                       
                }
                else{
                         System.out.println("Please login");
                }
        }

        @Override
        public void viewProductDetails(int productId) {
                // TODO Auto-generated method stub

                if(authentication){

                        if(hasPermission){

                                System.out.println("Authentication succ");
                                service.viewProductDetails(productId);
                        }
                        else {
                                System.out.println("No permission");
                                
                        }

                }
                else{
                 System.out.println("please login first");
                }
        } 

        @Override
        public void purchaseProduct(int productId) {
                // TODO Auto-generated method stub

                if(authentication){

                if(hasPermission)
                {
                  System.out.println("Authentical successfull-> perchase product");
                }
                else{
                        System.out.println("Access denied");
                }

                }
                else{
                        System.out.println("Login first");
                }
     
        }
        
}

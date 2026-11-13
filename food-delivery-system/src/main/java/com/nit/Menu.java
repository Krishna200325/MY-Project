package com.nit;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data 
@Component 
public class Menu {
        
        public void displayMenu(){
                System.out.println("Menu: Pizza, Burger, Pasta");
        }
}

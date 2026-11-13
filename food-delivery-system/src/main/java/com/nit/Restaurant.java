package com.nit;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
@Data
public class Restaurant {
        

        public void ditails(){

            System.out.println( "Restaurant: Domino's Pizza");
        }
}

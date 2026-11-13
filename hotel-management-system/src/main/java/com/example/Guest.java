package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;



@Data 
@Component 
public class Guest {
       
        @Value("${guestName}")
        private String guestName;

        public void guestNamee(){
                System.out.println("Guest Name:" +guestName);
        }
}

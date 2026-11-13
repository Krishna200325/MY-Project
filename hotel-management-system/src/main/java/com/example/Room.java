package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;



@Component 
@Data 
public class Room {
        
        @Value("${roomInfo}")
        private String roomInfo;

        public void displayRoomInfo(){
                System.out.println("Room Info: " +roomInfo);
        }

}

package com.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("Cricketteam")
public class Cricket {
       
        @Value("${teamname}")
        private String teamname;
        @Value("${numberOfPlayer}")
        private String numberOfPlayer;

        @Autowired 
        private  Iplteam iplteam;

}

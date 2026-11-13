package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
@Data 
public class HospitalService {
        
        @Autowired 
        private Doctor doctor;

        public void display(){
                doctor.displayAllDetails();
        }
}

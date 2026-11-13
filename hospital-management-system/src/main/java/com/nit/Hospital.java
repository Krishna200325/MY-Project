package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
@Data 
public class Hospital {
 
        @Autowired 
        private Department department;

        @Autowired 
        private Doctor doctor;

        @Autowired 
        private Patient patient;

        public void displayAllDetails(){
          
                department.displayDartment();
                doctor.drName();
                patient.patienname();
               System.out.println(" Hospital information loaded successfully!");
        }
}

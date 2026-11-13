
package com.nit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;



@Component 
@Data 
public class Doctor{

        @Value ("${doctorid}")
        private   int doctorid;

          @Value ("${doctorName}")
        private String doctorName; 

         @Value ("${specilaization}")
        private String specilaization;

         @Value ("${hospitalname}")
        private String hospitalname;

         @Value ("${consultencyfee}")
        private int consultencyfee;


        public void displayAllDetails(){
           System.out.println("Doctor Id: " +doctorid);
           System.out.println("Doctor Name: " +doctorName);
           System.out.println("Specilatization: " +specilaization);
           System.out.println("Hospital Name: " +hospitalname);
           System.out.println("Consultency fee: " +consultencyfee);

        }

}
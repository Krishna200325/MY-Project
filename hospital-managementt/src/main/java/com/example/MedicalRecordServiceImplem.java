package com.example;

import org.springframework.stereotype.Component;

@Component 
public class MedicalRecordServiceImplem implements MedicalRecordService{

        @Override
        public void viewPatientRecord(int patientID) {
             
                System.out.println("Patient View Successfully :" +patientID);

        }   

        @Override
        public void updatePatientRecord(int patientID, String diagnosis) {
        System.out.println("Update the Patient record");
        System.out.println("Patient Id:" +patientID);
        System.out.println("Update Patient record Successfully: " +diagnosis);
               
        }

        @Override
        public void deletePatientRecord(int patientId) {
              
                System.out.println("Patient Record Succesfully : " +patientId);
        }
        
}

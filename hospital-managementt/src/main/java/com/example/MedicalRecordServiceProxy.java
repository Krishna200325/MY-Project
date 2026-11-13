package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class MedicalRecordServiceProxy implements MedicalRecordService {

        
        @Autowired 
        private MedicalRecordServiceImplem medical ;


        private  String role = "Doctor";
        private String name = "Admin";

        private boolean autothentication = true;
        @Override
        public void viewPatientRecord(int patientID) {
                // TODO Auto-generated method stub
               
                if(autothentication){
                 if(role.equals("Doctor")|| name.equals("Admin")){
                      System.out.println("Allow Authentication");
                        medical.viewPatientRecord(patientID);
                 }
                    }
                    else if(!autothentication){
                     System.out.println("Doctor authentication failed");
                    }
                    else{

                        System.out.println("Access denied");
                    }
 
    




                
        }

        @Override
        public void updatePatientRecord(int patientID, String diagnosis) {
                // TODO Auto-generated method stub
             if(!autothentication){
                System.out.println("Doctor authen failed");
             }
             else if(role.equals("Doctor")){
                System.out.println("Allow succesfully");
                medical.updatePatientRecord(patientID, diagnosis);
             }
             else{
            System.out.println("Access denied");
             }
        }

        @Override
        public void deletePatientRecord(int patientId) {
                // TODO Auto-generated method stub
               
                if(!autothentication){
                        System.out.println("Restrict for deleteiton");
                }
                else if(name.equals("Admin")){
                  
                        System.out.println("Allow authen for delete the patient record");
                }
                else{
                        System.out.println("Access Deneied");
                }
        }
        
}

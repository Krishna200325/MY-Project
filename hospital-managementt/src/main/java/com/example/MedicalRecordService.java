package com.example;

interface MedicalRecordService {
        
 public void viewPatientRecord(int patientID);
 public void updatePatientRecord(int patientID,String diagnosis);
 public void deletePatientRecord(int patientId);

}

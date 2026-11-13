package com.nit;

import java.sql.Array;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
@ConfigurationProperties(prefix = "hospital")
@Data
public class HospitalConfig {
        
    private String hospitalName;
    private int totalBeds ;
   private double consultationFee;
   private boolean emergencyAvailable;
   private  char hospitalCode;

   List<String>doctorNames;
   Map<String,String> departmentHeads;
   Set<String> availableFacilities;

   private HospitalAddress hospitalAddress;
   private  String[] branchlocation;

   
}

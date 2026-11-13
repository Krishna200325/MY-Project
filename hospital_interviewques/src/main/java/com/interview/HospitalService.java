package com.interview;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("services")
public class HospitalService {
        

    
     private final Hospital hospital;
     public  List<Hospital> hospitalData;

     public  HospitalService(Hospital hospital){

        hospitalData = new ArrayList<Hospital>();
        this.hospital = hospital;
       
     }

        public int addHospital(String hospitalName, List<String> listOfTreatement, String contactPerson, String contactNumber,String location){
                
                Hospital hospital = new Hospital(hospitalName,listOfTreatement,contactPerson,contactNumber,location);

                hospitalData.add(hospital);

                return hospital.getHospitalCode();

        }

        public Map<Integer,String> getHospital(int code){

                Map<Integer,String>value = new LinkedHashMap<Integer,String>();

                for(Hospital data: hospitalData ){
                        if(data.getHospitalCode()==code){
                               value.put(data.getHospitalCode() , data.getContactPerson()) ;
                        }
                }
                return value;
 
        }

        public Hospital getHospitalDetails(int hospitalCode){

                for(Hospital data: hospitalData){
                
                        if(data.getHospitalCode() == hospitalCode){
                          
                                return data;
                        }
                        
                }
                return null;
        }
      
}

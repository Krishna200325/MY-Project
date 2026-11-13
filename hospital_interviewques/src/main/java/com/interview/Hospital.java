package com.interview;

import java.util.List;

import org.jspecify.annotations.Nullable;



public class Hospital {
        
        private static int  hospitalCode;
        String hospitalName;
        List <String> listOfTreatements;
        String contactPerson;
        String contactNumber;
        private String location;

        public Hospital(){
                
        }
        public Hospital(String hospitalName, List<String> listOfTreatements, String contactPerson, String contactNumber,
                        String location) {
                this.hospitalName = hospitalName;
                this.listOfTreatements = listOfTreatements;
                this.contactPerson = contactPerson;
                this.contactNumber = contactNumber;
                this.location = location;
                hospitalCode++;
        }

        public int getHospitalCode() {
                return hospitalCode;
        }

        public void setHospitalCode(Integer hospitalCode) {
                this.hospitalCode = hospitalCode;
        }

        public String getHospitalName() {
                return hospitalName;
        }

        public void setHospitalName(String hospitalName) {
                this.hospitalName = hospitalName;
        }

        public List<String> getListOfTreatements() {
                return listOfTreatements;
        }

        public void setListOfTreatements(List<String> listOfTreatements) {
                this.listOfTreatements = listOfTreatements;
        }

        public String getContactPerson() {
                return contactPerson;
        }

        public void setContactPerson(String contactPerson) {
                this.contactPerson = contactPerson;
        }

        public String getContactNumber() {
                return contactNumber;
        }

        public void setContactNumber(String contactNumber) {
                this.contactNumber = contactNumber;
        }

        public String getLocation() {
                return location;
        }

        public void setLocation(String location) {
                this.location = location;
        }

        @Override
        public String toString() {
                return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName
                                + ", listOfTreatements=" + listOfTreatements + ", contactPerson=" + contactPerson
                                + ", contactNumber=" + contactNumber + ", location=" + location + "]";
        }
        public void addHospital(String string) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'addHospital'");
        }
        

        

        

        
}

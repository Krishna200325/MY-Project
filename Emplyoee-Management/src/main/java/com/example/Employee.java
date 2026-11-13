package com.example;

public class Employee {

    private int empId;
    private String empName;
    private String department;
    private String designation;
    private int salary;
    private String location;

    // Constructor
    public Employee(EmployeeBuilder builder) {
        this.empId = builder.empId;
        this.empName = builder.empName;
        this.department = builder.department;
        this.designation = builder.designation;
        this.salary = builder.salary;
        this.location = builder.location;
    }

    // Employee Getter and Setter

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // NON-STATIC Builder
    public class EmployeeBuilder {

        private int empId;
        private String empName;
        private String department;
        private String designation;
        private int salary;
        private String location;

        public EmployeeBuilder setEmpId(int empId) {
            this.empId = empId;
            return this;
        }

        public EmployeeBuilder setEmpName(String empName) {
            this.empName = empName;
            return this;
        }

        public EmployeeBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public EmployeeBuilder setDesignation(String designation) {
            this.designation = designation;
            return this;
        }

        public EmployeeBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
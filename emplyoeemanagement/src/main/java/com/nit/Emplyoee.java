package com.nit;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Component
@ConfigurationProperties(prefix = "company")
public class Emplyoee {

    private String companyName;
    private int employeeCount;
    private double annualRevenue;
    private boolean active;
    private char branchCode;

    private List<String> emplyoeeNames;
    private Map<Integer, String> emplyoeDepartment;
    private Set<String> uniqueSkilss; 
    private CompanyAdd companyAdd;
    private String[] location;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public char getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(char branchCode) {
        this.branchCode = branchCode;
    }

    public List<String> getEmplyoeeNames() {
        return emplyoeeNames;
    }

    public void setEmplyoeeNames(List<String> emplyoeeNames) {
        this.emplyoeeNames = emplyoeeNames;
    }

    public Map<Integer, String> getEmplyoeDepartment() {
        return emplyoeDepartment;
    }

    public void setEmplyoeDepartment(Map<Integer, String> emplyoeDepartment) {
        this.emplyoeDepartment = emplyoeDepartment;
    }

    public Set<String> getUniqueSkilss() {
        return uniqueSkilss;
    }

    public void setUniqueSkilss(Set<String> uniqueSkilss) {
        this.uniqueSkilss = uniqueSkilss;
    }

    public CompanyAdd getCompanyAdd() {
        return companyAdd;
    }

    public void setCompanyAdd(CompanyAdd companyAdd) {
        this.companyAdd = companyAdd;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Emplyoee [companyName=" + companyName
                + ", employeeCount=" + employeeCount
                + ", annualRevenue=" + annualRevenue
                + ", active=" + active
                + ", branchCode=" + branchCode
                + ", emplyoeeNames=" + emplyoeeNames
                + ", emplyoeDepartment=" + emplyoeDepartment
                + ", uniqueSkilss=" + uniqueSkilss
                + ", companyAdd=" + companyAdd
                + ", location=" + Arrays.toString(location) + "]";
    }
}
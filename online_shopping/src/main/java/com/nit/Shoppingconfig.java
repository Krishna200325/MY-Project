package com.nit;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
@Data 
@ConfigurationProperties(prefix = "shopping")
public class Shoppingconfig {
   private String storeName;
    private int totalProducts;
    private double  deliveryCharge;
     private boolean onlinePayment;
     private char storeCode;

     private List<String>productNames;
     private Map<Integer,Integer>productPrice;
     private Set<String>paymentMethods;
     private StoreAddress storeAddress;
     private String[] deliveryLocations;
     
}

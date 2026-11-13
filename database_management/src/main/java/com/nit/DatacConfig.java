package com.nit;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data 
@ConfigurationProperties(prefix =  "database")
public class DatacConfig {
 
        private String driverClassName;
        private String url;
        private String username;
        private String password;
        private String environment;
}

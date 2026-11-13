package com.profile;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "payment")
public class Paymentfacotry {

        
        private String modeName;
        private String url;
        private String environment;
        private String status;
}


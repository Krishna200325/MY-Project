package com.nit;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component 
public class ProductService implements NotificationService {

        @Override 
        public void  notificationDisplay(){
                System.out.println("a real customer notification message.");
        }
}

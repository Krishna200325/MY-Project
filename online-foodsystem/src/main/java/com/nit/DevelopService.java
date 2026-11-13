package com.nit;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Profile ("dev")
@Component 
public class DevelopService implements  NotificationService{

        @Override
        public void notificationDisplay() {
                // TODO Auto-generated method stub
              
                System.out.println("a test notification message.");
        }
        
}

package com;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile ("live")
@Component
public class LivePaymentService implements PaymentService {
        
        public  void processPayment(){
                System.out.println("Live Payment Mode Active");
        
              System.out.println("Payment processed successfully");
        }
}

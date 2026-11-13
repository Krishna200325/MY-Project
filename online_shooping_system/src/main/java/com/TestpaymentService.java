package com;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class TestpaymentService implements PaymentService {
        
        public  void processPayment(){
                System.out.println("Test Payment Mode Active");
                System.out.println(" Payment processed using dummy payment");
        }

}

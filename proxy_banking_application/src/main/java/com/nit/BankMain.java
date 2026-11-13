package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication 
public class BankMain {
        
        public static void main(String[] args) {
                
         
                ApplicationContext context= SpringApplication.run(BankMain.class, args) ;

                BankServiceproxy service  = context.getBean(BankServiceproxy.class);

                System.out.println("---Deposit----");
                service.deposit(2000);
                
                System.out.println("Withdrawl");
                service.withdraw(1000);

                System.out.println("Invalid amount");
                service.withdraw(-500);

                System.out.println("Insuffient Balance");
                service.withdraw(500000);

                System.out.println("Check Balance");
                service.checkBalance();

                
        }
}

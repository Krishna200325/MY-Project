package com.nit;

import org.springframework.stereotype.Component;

@Component 
public class BankServiceImplement implements BankService {

        private double balance = 1000;
        @Override
        public void deposit(double amount) {
                // TODO Auto-generated method stub
                balance = balance+amount;

                System.out.println("Deposit: " +balance );

        }

        @Override
        public void withdraw(double amount) {
                // TODO Auto-generated method stub
                balance = balance - amount;
                System.out.println("After wtihdrawl:" +balance);
        }

        @Override
        public void checkBalance() {
                // TODO Auto-generated method stub
        
                  System.out.println("Available Balance:" +balance);
        }
        public  double getBalance(){
                return balance;
        }
}

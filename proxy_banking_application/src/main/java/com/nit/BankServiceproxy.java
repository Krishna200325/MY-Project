package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class BankServiceproxy implements BankService {


        @Autowired 
        private BankServiceImplement bankServiceImplement;

        @Override
        public void deposit(double amount) {
                
                if(amount > 0){
                 System.out.println("Deposit Validation successfull");
                   bankServiceImplement.deposit(amount);

                }
                else{
                    System.out.println("Amount should be greater than zero");    
                }
        }

        @Override
        public void withdraw(double amount) {
            
               if(amount<=0){
                System.out.println("Amount should be greateer than zero");

               }
               else if(amount<= bankServiceImplement.getBalance()){
                System.out.println("Withdrawl successfully");
                bankServiceImplement.withdraw(amount);
               }
               else{
                System.out.println("validation Fail: ->Insufficient Balnace");
               }
        }

        @Override
        public void checkBalance() {
               
                bankServiceImplement.checkBalance();
        }
        
}

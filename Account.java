/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank3;

/**
 *
 * @author hkelley
 */
abstract class Account {
    
        public long balance;
        private String holderName;
        private long overdraft;
        public long deposit;
        public long amount;
        public long mortbal;
        public long withdraw;
        public long borrowed; 
        public long newmortbal;
        
        public Account(String holder, long overdraft){
            holderName=holder;
            balance = overdraft;
            borrowed = overdraft;
            deposit(1000);
            withdraw(500);
            withdraw(1000);
            withdraw(2000);
        }
                
        public final void banktrans (String message, long amount){
            balance += amount;
          // if (balance < amount)
            //    System.out.println("Insufficient Funds");
            mortbal = borrowed - amount; 
            newmortbal -= mortbal * -1;
            System.out.println("Name: "+ holderName);
            System.out.println("Message: "+ message);
            System.out.println("Amount: "+ amount);
            if("Mortgage Payment: ".equals(message))
                System.out.println("Balance: " + newmortbal);
            else
            System.out.println("Balance: "+ balance);
        }
        
        public long getBalance(){
            return balance;
        }
        abstract boolean deposit(long amount);
        abstract boolean withdraw(long amount);
    }

     class CheckingAccount extends Account{
        public CheckingAccount(String holder, long overdraft){
            super(holder,overdraft);
           // System.out.println(holder +"  "+ overdraft);  
                   
        }
        @Override
        boolean deposit(long amount){
            banktrans("Checking Deposit",amount);
           // System.out.println("Deposit" + amount);
            return true;
        }
        @Override
        boolean withdraw(long amount){
             if (amount <= getBalance()) {
                banktrans("Checking withdraw", amount * -1);
                return true;
            }
            System.out.println("Insufficient Funds"); 
            return false;
        }
    }

     class MortgageAccount extends Account{
        // public long mortbal;
        public MortgageAccount(String holder, long borrowed){
            super(holder,borrowed);
            System.out.println(holder + " Initial Borrowed Amount: " + borrowed);
          //  System.out.println(holder + mortbal);
        }
        @Override
        boolean deposit(long amount){
            banktrans("Mortgage Payment: ", amount);
           // mortbal = borrowed - amount; 
           // newmortbal -= mortbal * -1;
           // System.out.println("mortbal" + newmortbal);
            return true;
        }
        @Override
        boolean withdraw(long amount){
            return false;
        }
    }


    


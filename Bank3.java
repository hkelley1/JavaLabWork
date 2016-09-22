/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank3;

//import java.util.Arrays;

/**
 *
 * @author hkelley
 */
public class Bank3 {

     /**
     * @param args the command line arguments
     */
   // public long amount;
   // public long deposit = 0;
   // public String acctType;
    
    public static void main(String[] args) {
       
        Account[] a = new Account[3];
        a[0]= new MortgageAccount("Paul",100000);
        a[1]= new CheckingAccount("Sam", 1000);
        a[2]= new CheckingAccount("Sally", 200);
             
            
    }
}

    

     

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author hkelley
 */
public class MyPackage1 {

    /**
     * @param args the command line arguments
     */
    static String[] word = {"\nThe ","quick ", "brown ","fox "};  
    public static void main(String[] args) {
  
       // static String[] args = {"The","quick", "brown","fox"};  
        for (int i=0; i<word.length; i++){
                
            System.out.print(word[i]);
        }

    }
}
       

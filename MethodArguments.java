package methodarguments;

import java.util.Arrays;
import java.util.List;
 
public class MethodArguments {
      public double result;
      public double num1 = 0;
      public double num2 = 0;
      
static String[] toNumber = new String[]{"zero","one","two","three",
        "four","five","six","seven","eight","nine","ten"};     

    public static void main(String[] args) {
  
        //int val1 = 1;
        //String val2=  "three";
        int val1 = 1;
        int val2=  4;
        //double val2 = 2.2;
        //Double val2=  2.2;
        //System.out.println(val1 + val2);
                
        MethodArguments methodArgument = new MethodArguments();
        methodArgument.addUp(val1,val2);
        //System.out.println(val1);
        System.out.print("result = ");
        System.out.println(methodArgument.getResult());
        
           }

      public void addUp(int num1, int num2){
         System.out.println(num1); 
           result = num1 + num2;
          }


      public void addUp(double num1, double num2) {
        System.out.print(num2);      
          result = num1 + num2;
         }


      public void addUp(String num1, String num2) {
      // System.out.print(num1);  
      if(Arrays.asList(toNumber).contains(num1) &&
          Arrays.asList(toNumber).contains(num2)) 
          result = Arrays.asList(toNumber).indexOf(num1) +
          Arrays.asList(toNumber).indexOf(num2);
          
      else
          
        System.out.println("Error - incorrect input value.");
           //System.out.println(num2);  
          }

      public double getResult(){return result;}


     }
        

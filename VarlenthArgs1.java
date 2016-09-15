package varlenthargs1;

import java.util.Arrays;
//import java.util.List;

public class VarlenthArgs1 {

      public double result;
      public int nums = 0;
      public double num2 = 0;
      
//static String[] toNumber = new String[]{"zero","one","two","three",
       // "four","five","six","seven","eight","nine","ten"};     

    public static void main(String[] args) {
  
        String val1 = "four";
        String val2=  "three";
        //int val1 = 1;
        //int val2=  4;
        //double val1 = 4.2;
        //double val2=  2.2;
        //System.out.println(val1 + val2);
                
        VarlenthArgs1 varlenthArgs1 = new VarlenthArgs1();
        varlenthArgs1.addUp(val1,val2);
        //System.out.println(val1);
        System.out.print("result = ");
        System.out.println(varlenthArgs1.getResult());
        
           }

        public void addUp(int... args) {
          // int result =0;
        int nums = 0;  // 
        for (int i : args) 
        nums += i;
          //System.out.println(nums); 
        result = nums;
           
         }
             //System.out.println(arg); 
             //System.out.println(nums)
            
        public void addUp(double... args) {
        // System.out.print(num2);      
           double nums = 0;
           for (double d : args) 
           nums += d;
          // System.out.println(nums); 
           result = nums;
           }
           //return = nums;
              //System.out.println(nums)
         
        public void addUp(String... args){
        int nums=0;
        //System.out.println(args);
        for (int i=0; i<args.length; i++) 
        nums += toNumber(args[i]);
        //System.out.println(nums);
        result = nums;
        }   
        public double getResult(){return result;}
    
      public static int toNumber(String a){
        String[] numbers={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        for (int i=0; i<numbers.length; i++) 
            if (a.equals(numbers[i])) {
          return i;
       }
      


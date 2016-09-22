/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author hkelley
 */
public class Casino {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        
      //  import java.util.concurrent.ThreadLocalRandom;
    //public class Enumerate {
public static void main(String[] args){
    slotmachine[] answer = spinWheel();
    for (int i=0; i<3; i++){
    System.out.println(answer[i].name());
    }
}   
public static slotmachine[] spinWheel(){
    int length = slotmachine.values().length;
    slotmachine[] result = new slotmachine[length];
    for (int i=0; i<3; i++) {
    int a = ThreadLocalRandom.current().nextInt(length);
    result[i]=slotmachine.values()[a];
    }
    return result;
    }
public enum slotmachine {
    BAR,
    MEDAL,
    COIN,
    TRIPLEBAR,
    CHERRY,
    TRIPLE777s,
    BLANK ;
    }
    
}
    


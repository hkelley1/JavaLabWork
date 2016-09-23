/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyfile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
/**
 *
 * @author hkelley
 */
public class CopyFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input file name: ");
        File in = new File(sc.nextLine());
       // System.out.println("Please enter file name two: ");
        //File out = new File(sc.nextLine());

        InputStream input = null;
            //OutputStream output = null;
        try {
            input = new FileInputStream(in);
        } catch (FileNotFoundException e1){
            System.out.println(e1.getMessage());
            System.out.println("\nFile not found please reenter the input file: ");
            in = new File(sc.nextLine());
            input = new FileInputStream(in);
           // if( !input.exists()){System.exit(0);};
            }
        
            
        System.out.println("\nPlease enter the output file name: ");
        File out = new File(sc.nextLine());
        
        OutputStream output = null;
        try {
            output = new FileOutputStream(out);
        } catch (FileNotFoundException e2){
           System.out.println(e2.getMessage());
           System.out.println("\nFile Not found, please reenter the output file name: ");
           out = new File(sc.nextLine());
           input = new FileInputStream(out);
        }


            byte[] buf = new byte[1024];
            int bytesRead;
            
        try {
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }

        } finally {
            input.close();
            output.close();
        }


    }

}
   

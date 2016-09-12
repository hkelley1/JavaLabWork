package Visa.Test.DataAnalyze;

import java.util.Scanner;

/**
 * Created by hkelley on 9/12/2016.
 */
public class DataAnalyze {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of data items: ");

            int numItems = Integer.parseInt(sc.nextLine());
            int[] newValue = new int[numItems];
            int a = 0;
            System.out.println(numItems);


            System.out.println("Enter one number at a time and press enter. When finished type done: ");
            String value = (sc.nextLine());
            while (!value.equals("done")) {
                newValue[a++] = Integer.parseInt(value);
                value = sc.nextLine();
            }
            int sum = 0;
            int min = newValue[0];
            int max = newValue[0];

            for (int i = 0; i < newValue.length; i++) {
                sum += newValue[i];
                if (newValue[i] < min){
                    min = newValue[i];
                }
                if (newValue[i] > max){
                    max = newValue[i];
                }
            }
            System.out.println("Mean: " + (sum / newValue.length));
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        }
    }


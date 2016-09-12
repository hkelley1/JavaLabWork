package Visa.Test.DataAnalyze;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number of data items: ");

                int numItems = Integer.parseInt(sc.nextLine());
                int[] theVals = new int[numItems];
                int a = 0;
                System.out.println(numItems);


                System.out.println("Enter one number at a time and press enter. When finished type done: ");
                String value = (sc.nextLine());
                while (!value.equals("done")) {
                    theVals[a++] = Integer.parseInt(value);
                    value = sc.nextLine();
                }
                int sum = 0;
                int min = theVals[0];
                int max = theVals[0];

                for (int i = 0; i < theVals.length; i++) {
                    sum += theVals[i];
                    if (theVals[i] < min){
                        min = theVals[i];
                    }
                    if (theVals[i] > max){
                        max = theVals[i];
                    }
                }
                System.out.println("Mean: " + (sum / theVals.length));
                System.out.println("Max: " + max);
                System.out.println("Min: " + min);
            }
        }


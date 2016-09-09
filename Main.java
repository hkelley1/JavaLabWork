package ConTemp;

import java.util.Scanner;

      public class Main {

            public static void main(String[] args) {

                double temperature, celsius;

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Temp in Fahrenheit:");
                temperature = sc.nextInt();

                celsius = 5 * (temperature - 32)/9;

                System.out.println("Temperatue in Celsius = " + celsius);
            }
        }


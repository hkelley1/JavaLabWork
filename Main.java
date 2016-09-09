package ConTemp;

import java.util.Scanner;
// test git
      public class Main {

            public static void main(String[] args) {
34
                double temperature, celsius;

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Temp in Fahrenheit:");
                temperature = sc.nextInt();

                celsius = 5 * (temperature - 32)/9;

                System.out.println("Temperatue in Celsius = " + celsius);
            }
        }


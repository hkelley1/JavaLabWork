package com.Visa.GetTemp;

import java.util.Scanner;

/**
 * Created by hkelley on 9/12/2016.
 */
public class ConTemp {

            public static void main(String[] args) {

            double temperature, celsius;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Temp in Fahrenheit:");
            temperature = sc.nextInt();

            celsius = 5 * (temperature - 32)/9;

            System.out.println("Temperatue in Celsius = " + celsius);
        }
    }



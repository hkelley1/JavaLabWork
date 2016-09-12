package com.Visa.Dayfinder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String month;
        String day;
        String inputYear;
        int newYear = 0;
        boolean timeToQuit = false;

        Scanner entry = new Scanner(System.in);
        System.out.println(timeToQuit);

        while (!timeToQuit) {
            System.out.print(" Enter The Month Spelled out: ");
            month = entry.nextLine();

            timeToQuit = month.equalsIgnoreCase("quit");
            //System.out.println(month);

            //System.out.println(timeToQuit);
            System.out.print(" Enter The Day: ");
            day = entry.nextLine();

            System.out.print(" Enter The Year: ");
            inputYear = entry.nextLine();


             int year = Integer.parseInt(inputYear);
             int intDay = Integer.parseInt(day);
             int intMonth = 0;

             switch (month.toLowerCase()) {
                    case "january":
                        intMonth = 1;
                        break;

                    case "february":
                        intMonth = 2;
                        break;

                    case "march":
                        intMonth = 3;
                        break;

                    case "april":
                        intMonth = 4;
                        break;

                    case "may":
                        intMonth = 5;
                        break;

                    case "june":
                        intMonth = 6;
                        break;

                    case "july":
                        intMonth = 7;
                        break;

                    case "august":
                        intMonth = 8;
                        break;

                    case "september":
                        intMonth = 9;
                        break;

                    case "october":
                        intMonth = 10;
                        break;

                    case "november":
                        intMonth = 11;
                        break;

                    case "december":
                        intMonth = 12;
                        break;

                    default:
                        System.out.println("Invalid month Please Try Again ");
                }

                if (month == "january" || month == "february");
                    intMonth += 12;
                    year -= 1;

                //System.out.println(intMonth);

                int a = (13 * (intMonth + 1)) / 5;
                    //System.out.println(a);
                int b = year / 4;
                    //System.out.println(b);
                int c = 6 * (int) (year / 100);
                    //System.out.println(c);
                int d = year / 400;
                    //System.out.println(d);
                int result = (a + b + c + d + intDay + year) % 7;

                //System.out.println(intDay);
                //System.out.println(year);

                String resultString;

                switch (result) {
                    case 0:
                        resultString = "Saturday";
                        break;
                    case 1:
                        resultString = "Sunday";
                        break;
                    case 2:
                        resultString = "Monday";
                        break;
                    case 3:
                        resultString = "Tuesday";
                        break;
                    case 4:
                        resultString = "Wednesday";
                        break;
                    case 5:
                        resultString = "Thursday";
                        break;
                    case 6:
                        resultString = "Friday";
                        break;
                    default:
                        resultString = "Error";
                        break;
                }
                System.out.println("The day of the date " + intDay + "-" + month + "-" + year + " is :" + resultString);
            }

        }
    }



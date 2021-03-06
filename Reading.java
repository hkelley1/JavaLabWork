package weather;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Reading {

    String dayOfWeek;
    int hourOfDay;
    int temp;
    int windSpeed;

    Reading(String s) {
        String[] sArray = s.split(",");
        dayOfWeek = sArray[0].trim();
        hourOfDay = Integer.valueOf(sArray[1].trim());
        temp = Integer.valueOf(sArray[2].trim());
        windSpeed = Integer.valueOf(sArray[3].trim());
    }


    String rateTemperature() {
        if (temp < 55)
            return "cold";
        else if (temp < 65)
            return "mild";
        else if (temp < 80)
            return "warm";
        else return "hot";

    }

    String getTime() {
        if (hourOfDay == 9)
            return (dayOfWeek + " " + "morning");
        else if (hourOfDay == 15)
            return (dayOfWeek + " " + "afternoon");
        else if (hourOfDay == 21)
            return (dayOfWeek + " " + "evening");
        else return "";
    }

    public static void main(String[] args) throws Throwable {
        BufferedReader br = Files.newBufferedReader(
                Paths.get("c://users/hkelley/weather.csvx"));
        Reading[] readings = new Reading[12];
        String line;
        for (int i = 0; i < readings.length; i++) {
            readings[i] = new Reading(br.readLine());
        }
        for (int i = 0; i < readings.length; i++) {
            System.out.println(readings[i].getTime() + " was " + readings[i].rateTemperature());
        }
    }
}
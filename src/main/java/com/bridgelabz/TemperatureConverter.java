package com.bridgelabz;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) +32;
    }
    public static double FahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32)*5/9;
    }

}

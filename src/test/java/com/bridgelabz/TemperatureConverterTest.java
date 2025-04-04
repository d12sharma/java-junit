package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    @Test
    void thirtyCelsiusToFahrenheit(){

        assertEquals(86,TemperatureConverter.celsiusToFahrenheit(30));
    }
    @Test
    void seventyFiveToCelsius(){
        assertEquals(23.88888888888889,TemperatureConverter.FahrenheitToCelsius(75));
    }

}
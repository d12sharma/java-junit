package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    @Test
    void  twoPlusTwoEqualsFour(){
        Calculator calculator1 = new Calculator();
        assertEquals(4,calculator1.add(2,2));
    }
    @Test
    void tenMinusFiveEqualsFive(){
        Calculator calculator2 = new Calculator();
        assertEquals(5,calculator2.subtract(10,5));
    }
    @Test
    void threeMultiplyTwoEqualsSix(){
        Calculator calculator3 = new Calculator();
        assertEquals(6,calculator3.multiply(3,2));
    }
    @Test
    void tenDivideFiveEqualsTwo(){
        Calculator calculator4 = new Calculator();
        assertEquals(2,calculator4.divide(10,5));
    }
    @Test
    void  tenDividezero(){
        Calculator calculator5 = new Calculator();
        assertEquals(0,calculator5.divide(10,0));
    }

  
}
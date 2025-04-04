package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideExceptionTest {
    @Test
    void DivideByZero(){
        assertThrows(ArithmeticException.class, () ->DivideException.divide(10,0));
    }
    @Test
    void Divide(){
        assertEquals(6,DivideException.divide(12,2));
        assertEquals(0,DivideException.divide(10,0));
    }

}
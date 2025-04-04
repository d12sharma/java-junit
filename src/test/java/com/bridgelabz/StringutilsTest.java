package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringutilsTest {
    @Test
    void reverseString(){

        assertEquals("olleh",Stringutils.reverse("hello"));
        assertEquals("vurhd",Stringutils.reverse("dhruv"));
    }
    @Test
    void palindromechecker(){
        assertEquals(true,Stringutils.palindrome("madam"));
        assertEquals(false,Stringutils.palindrome("dhruv"));
    }
    @Test
    void uppercasecheck(){
        assertEquals("DHRUV",Stringutils.uppercase("dhruv"));
        assertEquals("SHARMA",Stringutils.uppercase("sharma"));
    }

}
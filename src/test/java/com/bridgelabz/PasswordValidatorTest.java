package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void passwordOne(){
        PasswordValidator password1 = new PasswordValidator();
        assertEquals(true,password1.CheckPassword("Dhruv_12sharma"));
    }
    @Test
    void passwordTwo(){
        PasswordValidator password = new PasswordValidator();
        assertEquals(true,password.CheckPassword("Dhruv"));
    }
    @Test
    void passwordThree(){
        PasswordValidator password = new PasswordValidator();
        assertEquals(true,password.CheckPassword("dhruv1234"));
    }


}
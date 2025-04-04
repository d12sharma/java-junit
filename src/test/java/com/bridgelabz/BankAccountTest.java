package com.bridgelabz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private  BankAccount account;
    @BeforeEach
    void setup(){
        account = new BankAccount(100);
    }
    @Test
    void depositingthousand(){

        assertEquals(1100,account.deposit(1000));
    }
    @Test
    void withdrawfiveHundred(){
        assertEquals(600,account.withdraw(500));

    }
    @Test
    void withdrawMoreMoneyThanBalance(){
        assertEquals(1000,account.withdraw(1000));
    }
    @Test
    void depositFiveThousand(){
        assertEquals(5100,account.deposit(5000));
    }

}
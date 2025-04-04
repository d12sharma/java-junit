package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {
    @BeforeEach
    void connection(){
        DatabaseConnection.connected();
    }
    @AfterEach
    void disconnection(){
        DatabaseConnection.disconnected();
    }
    @Test
    void Checkconnection(){
        assertTrue(DatabaseConnection.Isconnected());
    }
    @Test
    void Disconnect(){
        DatabaseConnection.disconnected();
        assertFalse(DatabaseConnection.Isconnected());
    }

}
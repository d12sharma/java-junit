package com.bridgelabz;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {


    @Test
    void addElement(){
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list,2);
        ListManager.addElement(list,5);
        assertTrue(list.contains(2));
        assertFalse(list.contains(3));
    }
    @Test
    void removeElement(){
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list,3);
        ListManager.addElement(list,5);
        ListManager.removeElement(list,3);
        assertFalse(list.contains(3));

    }
    @Test
    void getListSize(){
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list,10);
        ListManager.addElement(list,2);
        assertTrue(list.size()==2);
        ListManager.removeElement(list,10);
        assertFalse(list.size()==2);
    }

}